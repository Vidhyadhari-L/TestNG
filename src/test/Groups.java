package test;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups= {"sanity"})
	public void method1() {
		

		System.out.println("Test case 1 is execuited");
}
		
		@Test(groups= {"Regression"})
		public void method2() {
			System.out.println("Test case 2 is execuited");
		
	}

}
