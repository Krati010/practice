package practice.generic;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib
{
	 public static WebDriver driver; //framewrk global driver
	    
	    @BeforeMethod(groups= {"Smoke", "Functional", "Integration", "System"})
	    @Parameters({"browser", "baseurl"})  //should be defined inside testng suite file
	    public void preCondition(String browserName, String url)
	    {
	    	driver= BrowserFactory.launchBrowser(browserName);
	    	driver.manage().window().maximize();
	    	driver.get(url);
	    	Reporter.log(url+" url navigated", true);
	    }
	    
	 //   @Parameters({"browser1", "baseurl1"})  //should be defined inside testng suite file
//	    public void preCondition1(String browserName1, String url1)
//	    {
//	    	driver= BrowserFactory.launchBrowser("firefox");
//	    	driver.manage().window().maximize();
//	    	driver.get(url1);
//	    	Reporter.log(url1+" url navigated", true);
//	    }
	    
	    @AfterMethod
	    public void postCondition()
	    {
	    	driver.close();
	    	Reporter.log("Browser closed" , true);
	    
	    	
	    }
}
