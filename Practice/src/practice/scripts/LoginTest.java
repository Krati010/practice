package practice.scripts;

//import org.apache.log4j.Appender;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.FileAppender;
//import org.apache.log4j.Layout;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import practice.generic.BaseLib;
import practice.generic.BrowserFactory;
import practice.generic.ExcelLib;
import practice.pom.HomePage;
import practice.pom.LoginPage;
import practice.pom.ProductPage;

public class LoginTest extends practice.generic.BaseLib
{	
  
 // @Parameters({"browser", "baseurl"})

//public void preCondition(String browserName, String url)
//{
//}
	@Test
public void validLogin()   throws Exception
{
//	driver= BrowserFactory.launchBrowser("chrome");
//	driver.manage().window().maximize();
//	driver.get("http://localhost:8888/");
	
	String filepath="./testData/ExcelSheet.xlsx";
	ExcelLib elib= new ExcelLib(filepath);
	
	String[] data=elib.readData("Sheet1", "ACT_001" );
	
	
	
//	String username = elib.readData("Sheet1", 0, 1);
//	String pwd = elib.readData("Sheet1", 0, 2);
//	String prodName = elib.readData("Sheet1", 0, 3);
//	String partNo = elib.readData("Sheet1", 0, 4);
//	//String salStDt = elib.readData("Sheet1", 0, 5);
//	String mfg = elib.readData("Sheet1", 0, 6);
//	String prodCatg = elib.readData("Sheet1", 0, 7);
////	String venName = elib.readData("Sheet1", 0, 8);
//	String web = elib.readData("Sheet1", 0, 9);
//	String VenPartNo = elib.readData("Sheet1", 0, 10);
//	String mfrPartNo = elib.readData("Sheet1", 0, 11);
//	String prodSheet = elib.readData("Sheet1", 0, 12);
//	String srlNo = elib.readData("Sheet1", 0, 13);
//	String unitPrice = elib.readData("Sheet1", 1, 0);
//	String commissionRate = elib.readData("Sheet1", 1, 1);
//	String usageUnit = elib.readData("Sheet1", 2, 0);
//	String qtyUnit = elib.readData("Sheet1", 2, 1);
//	String qtyinStk = elib.readData("Sheet1", 2, 2);
//	String reorderLevel = elib.readData("Sheet1", 2, 3);
//	String qtyDemand = elib.readData("Sheet1", 2, 4);
//	String description = elib.readData("Sheet1", 3, 0);
//@Test
//@Parameters({"browser", "baseurl"})//launching frm suit but browser and baseurl
                                   //it will take frm script

	  //should be defined inside testng suite file
//	    public void preCondition(String browserName, String url)
//	    {
//	        driver= BrowserFactory.launchBrowser(browserName);
//	    	driver.manage().window().maximize();
//	    	driver.get(url);
//	
//	@Test
//	public void validLogin() throws Exception  
//	{
	LoginPage lp= new LoginPage(driver);
	lp.loginDetails(data[1],data[2]);
//}
//@Test
//@Parameters({"browser", "baseurl"})
//@Test
//public void product() throws Exception
//  {
////	    public void preCondition(String browserName, String url)
////	    {
////	        System.setProperty("webdriver.ie.driver","./exefiles/IEDriverServer.exe" );
////	        driver= new InternetExplorerDriver();
////	    	driver.manage().window().maximize();
////	    	driver.get("http://localhost:8888/");
//    	LoginPage lp= new LoginPage(driver);
//	    lp.loginDetails(data[1], data[2]);
	    
	HomePage hp= new HomePage(driver);
    Thread.sleep(3000);
	hp.getProductEle().click();
    Thread.sleep(3000);
	ProductPage pp= new ProductPage(driver);
    Thread.sleep(3000);
	pp.getAddBtn().click();
    Thread.sleep(3000);
    
	pp.proInfo(data[3], data[4], data[5], data[6],  data[7], data[8], data[9], data[10], data[11]); //salStDt
    Thread.sleep(3000);
    
	pp.priceInfo(data[12], data[13]);
	Thread.sleep(3000);
	
	pp.stockInfo(data[14], data[15], data[16], data[17], data[18]);
    Thread.sleep(3000);
    
	pp.DescrpInfo(data[19]);
    Thread.sleep(3000);
  }}
	


