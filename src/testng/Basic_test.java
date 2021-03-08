package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Basic_test {
	WebDriver driver; 
	public String baseUrl="https://www.guru99.com/test/newtours/";
	
	SoftAssert assertobj=new SoftAssert();
  @Test
  public void verifyHomepageTitle() {
      
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.gecko.driver", "/home/lavanyamstecnot/Downloads/geckodriver");
      driver = new FirefoxDriver();
      driver.get(baseUrl);
     String expectedTitle = "TEST Management Tutorials: Complete Training Course";
      String actualTitle = driver.getTitle();
    //  System.out.println(actualTitle);
     Assert.assertEquals(actualTitle, expectedTitle);
      
     // assertobj.assertEquals(actualTitle, expectedTitle); soft assert
      System.out.println("hi");
   
      driver.quit();
  }
}
