// PersonRepository.java
package grailsSdn4j.neo4j.repository;

import grailsSdn4j.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {    
    Person findByName(String name);    
}
