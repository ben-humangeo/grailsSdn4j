package grailsSdn4j.services

interface RestfulService {

    def list (Map params) throws Throwable

    def count (Map params) throws Throwable

    def show (Map params) throws Throwable

    def create (Map content, Map params) throws Throwable

    def update (Map content, Map params) throws Throwable

    void delete (Map content, Map params) throws Throwable

}
