package grailsSdn4j.controllers

import grailsSdn4j.neo4j.GrailsN4jGraph;

class MainController {

    GrailsN4jGraph grailsGraph

    def index() { 
		render (view: "/index")
	}
}
