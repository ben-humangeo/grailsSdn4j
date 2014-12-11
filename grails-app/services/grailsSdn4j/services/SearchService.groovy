package grailsSdn4j.services

import java.util.Map;
import net.hedtech.restfulapi.PagedResultArrayList

import grails.transaction.Transactional

@Transactional
class SearchService extends AbstractRestfulService {

	def list(Map params) throws Throwable {
		return new PagedResultArrayList([], [].size())
	}

	def show(Map params) throws Throwable {
		
	}

	def create(Map content, Map params) throws Throwable {

	}

	def update(Map content, Map params) {
		
	}

	void delete(Map content, Map params) {
		
	}
	
	def count (Map params) throws Throwable {
		
	}
	
}
