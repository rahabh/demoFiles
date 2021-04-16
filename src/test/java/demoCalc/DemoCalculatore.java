package demoCalc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCalculatore {
	@Test
	public void sum() {
		System.out.println("sum : " );
		int a =10;
		int b = 20;
		int sums = a +b;
		System.out.println("sum : " + sums);
		Assert.assertEquals(30, sums);
	}
	
	@Test
	public void sub() {
		int a =10;
		int b = 20;
		int subs = b-a;
		System.out.println("sub : " +subs);
		Assert.assertEquals(10, subs);
	}
	
	

}
