
package grailsSdn4j.neo4j;

import grailsSdn4j.Person;
import grailsSdn4j.neo4j.repository.PersonRepository;

import org.neo4j.graphdb.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.core.GraphDatabase;

@Configuration
public class GrailsN4jGraph extends Neo4jConfiguration {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    GraphDatabase graphDatabase;

    public String testThatWeCanAccessDatabase() throws Exception {
        Person greg = new Person("Greg");

        Transaction tx = graphDatabase.beginTx();
        try {
            personRepository.save(greg);
	    greg = personRepository.findByName("Greg");
            tx.success();
        } finally {
            tx.close();
        }
        return greg.name;
    }
    
}

