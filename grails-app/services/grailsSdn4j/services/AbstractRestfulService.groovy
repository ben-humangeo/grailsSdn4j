package grailsSdn4j.services

import java.util.Map

abstract class AbstractRestfulService implements RestfulService {
    
    def grailsApplication

    abstract def update(Map content, Map params)

    abstract void delete(Map content, Map params)

    def update(def id, Map content, Map params) {
        update(content, params)
    }

    def delete(def id, Map content, Map params) {
        delete(content, params)
    }

    def count (Map params) throws Throwable {
        throw new UnsupportedOperationException ()
    }
	
}
