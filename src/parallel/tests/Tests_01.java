package parallel.tests;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import parallel.utils.ThrededDriverManager;
 
public class Tests_01 {
	

	
    @Test
    public void testMethod1() throws InterruptedException {
    	System.out.println(" start test 01");
    	
    	//WebDriver driver =  ThrededDriverManager.getDriver();
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.google.com");
    	System.out.println(" end m1");
    }
 
    @Test
    public void testMethod2() throws InterruptedException {
    	//WebDriver driver =  ThrededDriverManager.getDriver();
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.yahoo.com");
    	System.out.println(" end m2");
 
    }
 
}