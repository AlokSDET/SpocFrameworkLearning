package specifications

import groovyTests.SumOfTwoNumber
import spock.lang.Shared
import spock.lang.Specification

class SpecDemo extends Specification {

	
	
	def setup() {
		println "this will execute before each feature method"
	}
	
	def cleanup() {
		println "this will execute after each feature method"
	}
	
	
	def setupSpec() {
		println "this will execute before spec"
	}
	
	def cleanupSpec() {
		println "this will execute after spec"
	}
	
	
	def "First Test"() {
		expect :
		Math.max(2,3)==3
	}

	// Instance Field: This will be different for each feature method.
	
	
	def obj = new SumOfTwoNumber();
	
	def "First Groovy Test"() {
		// any one block (given/setup, cleanup, when, then, expect 
		//should be available in feature method
		given:
		 println "first method";
		 println obj;
	}

	
	def "Second Groovy Test"() {
		given:
		 println "second method";
		 println obj;
	}

	
	// shared instance field
	
	@Shared obj1 = new SumOfTwoNumber();
	
	
	def "First Groovy Shared Test"() {
		// any one block (given/setup, cleanup, when, then, expect
		//should be available in feature method
		given:
		 println "first shared method";
		 println obj1;
	}

	
	def "Second Groovy Shared Test"() {
		given:
		 println "second shared method";
		 println obj1;
	}

	
}