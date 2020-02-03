
package groovyTests;

import java.util.Random;
public class SumOfTwoNumber{

	public SumOfTwoNumber() {
		int i = new Random().nextInt();
		println(i);
	}



	public int add(int a, int b) {
		return a + b;
	}
}