package parallel.tests;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import parallel.utils.ThrededDriverManager;
 
public class Tests_02 {
	WebDriver driver = null; 
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(@Optional("chrome") String browser)
	{
		System.out.println("Thread : " + Thread.currentThread().getId());
		if (browser.equalsIgnoreCase("chrome")){
			driver  = new ChromeDriver();
	    	
		}
		if (browser.equalsIgnoreCase("firefox")){
			 driver = new FirefoxDriver();
	    	
		}
	}
	
    @Test
    public void testMethod1() throws InterruptedException {
    	System.out.println(" start test 01");
    	System.out.println("Thread : " + Thread.currentThread().getId());
		
    	//WebDriver driver =  ThrededDriverManager.getDriver();
    	driver.get("http://www.google.com");
    	
    	System.out.println( "number of divs on page " + 
    			driver.findElements(By.tagName("div")).size()
    				);
    	
    	System.out.println(" end test 01");
    }
 

}