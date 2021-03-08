package testng;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//AfterMethod annotation is similar to Before Method
public class Beforemethod
{
	int a=10;  
	int b=9;  
	@BeforeMethod  
	public void before_method()  
	{  
	System.out.println("This method will be invoked before every test method");  
	}  
	@Test  //multiple test cases run according to alphabetical order
	public void sum()  
	{  
	int sum;  
	sum=a+b;  
	System.out.print("Sum of a and b is : "+sum);  
	}  
	@Test  
	public void difference()  
	{  
	int diff;  
	diff=a-b;  
	System.out.println("Difference of a and b is :"+diff);  
	  } 
  

}
