package specifications

import groovyTests.SumOfTwoNumber
import spock.lang.Specification

class SpocLearning extends Specification{


	def "feature method"() {

		setup:
		def a = 5;
		def b =6;

		def obj = new SumOfTwoNumber();

		when:
		def sum = obj.add(a, b);

		then:
		sum == 11;

		when:
		def list = [];
		list.add(10);
		list.add(20);

		then:
		list.size() ==2;

		when:

		def list1 = [];
		list1.add(2);
		list1.add(3);
		println list1.get(5);

		then :
		thrown(IndexOutOfBoundsException);
		def boo = list1.contains(4);
		println boo;
	}
}



