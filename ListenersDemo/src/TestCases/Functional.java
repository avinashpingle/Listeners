package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllListeners.Listener1.class)
public class Functional {
	@Test(successPercentage=100)
	public void m1() {
		System.out.println("m1 test case of Functional");
		if(true){
			throw new ArithmeticException();
		}
		System.out.println("Repeat");
		System.out.println("Continue");

	}
	@Test
	public void m2() {
		System.out.println("m2 of Functional");

	}

}
