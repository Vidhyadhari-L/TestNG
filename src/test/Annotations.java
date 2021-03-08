package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	    
	    @BeforeTest
	    public void beforetest()
	    {
	        System.out.println("before test is Executed");
	    }
	    
	    @BeforeMethod
	    public void beforemethod()
	    {
	        System.out.println("before method is Executed");
	    }
	    
	    @Test
	    public void method1()
	    {
	        System.out.println("method1 Cases is Executed");
	    }
	    @Test
	    public void method2()
	    {
	        System.out.println("method2 Cases is Executed");
	    }
	    
	    @AfterMethod
	    public void aftermethod()
	    {
	        System.out.println("after test is Executed");
	    }
	}



