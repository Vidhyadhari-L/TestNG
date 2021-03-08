package test;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;


public class ParameterEx {
	
	
	@Parameters({"nameparam"})
	@Test
	public void testcase(String name)
	{
	System.out.println("hi "+name);
	}
	}


