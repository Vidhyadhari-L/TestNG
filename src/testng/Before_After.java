package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_After {
	
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	   
	    public WebDriver driver ; 
	     
	     @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          System.setProperty("webdriver.gecko.driver", "/home/lavanyamstecnot/Downloads/geckodriver");
	          driver = new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	     
	     @Test
	    public void verifyHomepageTitle() {
	          String expectedTitle = "TEST Management Tutorials: Complete Training Course";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	         
	     }
	      @AfterTest
	      public void terminateBrowser(){
	          driver.quit();
	      }
}
