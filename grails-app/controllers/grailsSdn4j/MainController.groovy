package grailsSdn4j

import grailsSdn4j.GrailsN4jGraph

class MainController {

    GrailsN4jGraph grailsGraph

    def index() { 
		render (view: "/index")
	}
}
