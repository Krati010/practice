package practice.pom;

import java.util.Iterator;
//import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import practice.generic.BaseLib;

public class ProductPage 
{

	//WebDriver driver;
	
@FindBy(xpath="//img[contains(@title, 'Create Product')]")
private WebElement addBtn;
@FindBy(name="productname")
private WebElement productnameTxtBx;
@FindBy(id="productcode")
private WebElement partNoTxtbx;

@FindBy(xpath="//img[contains(@id,'sales_start_date')]")
private WebElement startDateTxtBx;
@FindBy(xpath="/html/body/div[17]/table/tbody/tr[2]/td[2]")                                  //td[text()='Mon, Oct 12']
private WebElement dateEle;


@FindBy(name="manufacturer")
private WebElement manufacturerTxtBx;
@FindBy(name="productcategory")
private WebElement productcategoryTxtBx;
//@FindBy(name="start_date")
//private WebElement start_dateTxtBx;
//@FindBy(name="sales_end_date")
//private WebElement sales_end_dateTxtBx;
//@FindBy(name="expiry_date")
//private WebElement expiry_dateTxtBx;
@FindBy(xpath="//img[@title='Select']")              
private WebElement vendor_nameTxtBx;
@FindBy(xpath="//a[@id='5']")       
private WebElement txt_nameEle;
@FindBy(id="search_txt")
private WebElement search_txtEle;
@FindBy(name="website")
private WebElement websiteTxtBx;
@FindBy(id="vendor_part_no")
private WebElement vendor_part_noTxtBx;
@FindBy(id="mfr_part_no")
private WebElement mfr_part_noTxtBx;
@FindBy(id="productsheet")
private WebElement productsheetTxtBx;
@FindBy(id="serial_no")
private WebElement serial_noTxtBx;   //
@FindBy(name="glacct")
private WebElement glacctTxtBx;
@FindBy(id="unit_price")
private WebElement unit_priceTxtBx;
@FindBy(id="commissionrate")
private WebElement commissionrateTxtBx;
@FindBy(id="tax1_check")
private WebElement tax1_checkTxtBx;
@FindBy(id="tax2_check")
private WebElement tax2_checkTxtBx;
@FindBy(id="tax3_check")
private WebElement tax3_checkTxtBx;
@FindBy(name="usageunit")
private WebElement usageunitTxtBx;
@FindBy(id="qty_per_unit")
private WebElement qty_per_unitTxtBx;
@FindBy(id="qtyinstock")
private WebElement qtyinstockTxtBx;
@FindBy(id="reorderlevel")
private WebElement reorderlevelTxtBx;
@FindBy(id="qtyindemand")
private WebElement qtyindemandTxtBx;
@FindBy(id="my_file_element")
private WebElement imgTxtBx;
@FindBy(name="description")
private WebElement descriptionTxtBx;
@FindBy(xpath="(//input[@type='submit'])[2]")
private WebElement saveBtn;


public WebElement getPartNoTxtbx() {
	return partNoTxtbx;
}
//public WebElement getStartDateTxtBx() {
//	return startDateTxtBx;
//}
public WebElement getManufacturerTxtBx() {
	return manufacturerTxtBx;
}
public WebElement getProductcategoryTxtBx() {
	return productcategoryTxtBx;
}
public WebElement getStartDateTxtBx() {
	return startDateTxtBx;
}
//}
//public WebElement getSales_end_dateTxtBx() {
//	return sales_end_dateTxtBx;
//}
//public WebElement getExpiry_dateTxtBx() {
//	return expiry_dateTxtBx;
//}
public WebElement getVendor_nameTxtBx() {
	return vendor_nameTxtBx;
}
public WebElement getTxt_nameEle() {
	return txt_nameEle;
}
public WebElement getSearch_txtEle() {
	return search_txtEle;
}
public WebElement getImgTxtBx() {
	return imgTxtBx;
}
public WebElement getWebsiteTxtBx() {
	return websiteTxtBx;
}
public WebElement getVendor_part_noTxtBx() {
	return vendor_part_noTxtBx;
}
public WebElement getMfr_part_noTxtBx() {
	return mfr_part_noTxtBx;
}
public WebElement getProductsheetTxtBx() {
	return productsheetTxtBx;
}
public WebElement getSerial_noTxtBx() {
	return serial_noTxtBx;
}
public WebElement getGlacctTxtBx() {
	return glacctTxtBx;
}
public WebElement getUnit_priceTxtBx() {
	return unit_priceTxtBx;
}
public WebElement getCommissionrateTxtBx() {
	return commissionrateTxtBx;
}
public WebElement getTax1_checkTxtBx() {
	return tax1_checkTxtBx;
}
public WebElement getTax2_checkTxtBx() {
	return tax2_checkTxtBx;
}
public WebElement getTax3_checkTxtBx() {
	return tax3_checkTxtBx;
}
public WebElement getUsageunitTxtBx() {
	return usageunitTxtBx;
}
public WebElement getQty_per_unitTxtBx() {
	return qty_per_unitTxtBx;
}
public WebElement getQtyinstockTxtBx() {
	return qtyinstockTxtBx;
}
public WebElement getReorderlevelTxtBx() {
	return reorderlevelTxtBx;
}
public WebElement getQtyindemandTxtBx() {
	return qtyindemandTxtBx;
}
public WebElement getMy_file_elementTxtBx() {
	return imgTxtBx;
}
public WebElement getDescriptionTxtBx() {
	return descriptionTxtBx;
}
public WebElement getSaveBtn() {
	return saveBtn;
}
public ProductPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getAddBtn() {
	return addBtn;
}
public WebElement getProductnameTxtBx() {
	return productnameTxtBx;
}
public void proInfo(String prodName, String partNo,  String mfg, String prodCatg,   String web, String VenPartNo, String mfrPartNo,String prodSheet, String srlNo) throws Exception
{                                                 
	productnameTxtBx.sendKeys(prodName); 
	partNoTxtbx.sendKeys(partNo);
    Thread.sleep(3000);

    startDateTxtBx.click();  
    Thread.sleep(5000);
    dateEle.click();
    Thread.sleep(3000);

	manufacturerTxtBx.click();
    Thread.sleep(3000);

	Select sel= new Select(manufacturerTxtBx);
	sel.selectByVisibleText(mfg);
 //  Thread.sleep(3000);
	
	productcategoryTxtBx.click();
    Thread.sleep(3000);

	Select sel2= new Select(productcategoryTxtBx);
	sel2.selectByVisibleText(prodCatg);
   Thread.sleep(3000);
   
  //  Actions act = new Actions(driver);
 //  act.doubleClick(); 
 //  BaseLib.driver.getWindowHandle();
   vendor_nameTxtBx.click();
   
   Thread.sleep(5000);
 
   Set<String> sessions = BaseLib.driver.getWindowHandles();
   System.out.println(sessions.size());
   Iterator<String> itr = sessions.iterator();
   String parentID = itr.next();

   String childID = itr.next();
   BaseLib.driver.switchTo().window(childID);
//    driver.manage().window().maximize();
//   Thread.sleep(15000);
   
 //  search_txtEle.sendKeys("Mary");
 
    txt_nameEle.click();
  
   BaseLib.driver.switchTo().window(parentID);
 
   Thread.sleep(9000);
	  
	websiteTxtBx.sendKeys(web);
	vendor_part_noTxtBx.sendKeys(VenPartNo);
	mfr_part_noTxtBx.sendKeys(mfrPartNo);
	productsheetTxtBx.sendKeys(prodSheet);
	mfr_part_noTxtBx.sendKeys(mfrPartNo);
	serial_noTxtBx.sendKeys(srlNo);
}
public void priceInfo(String unitPrice, String commissionRate)
{
	unit_priceTxtBx.sendKeys(unitPrice);
	commissionrateTxtBx.sendKeys(commissionRate);
	tax1_checkTxtBx.click();
	tax2_checkTxtBx.click();
	tax3_checkTxtBx.click();
}
public void stockInfo(String usageUnit,String qtyUnit,String qtyinStk, String reorderLevel, String qtyDemand) throws Exception
{
	usageunitTxtBx.click();
    Thread.sleep(3000);

	Select sel3= new Select(usageunitTxtBx);
	sel3.selectByVisibleText(usageUnit);
    Thread.sleep(3000);
	
	qty_per_unitTxtBx.sendKeys(qtyUnit);
	qtyinstockTxtBx.sendKeys(qtyinStk);
	reorderlevelTxtBx.sendKeys(reorderLevel);
	qtyindemandTxtBx.sendKeys(qtyDemand);
	
}
public void proImgInfo( )
{
	
}
public void DescrpInfo(String description) throws Exception
{
	
//	imgTxtBx.click();
//    Thread.sleep(3000);

	imgTxtBx.sendKeys("C:\\Users\\dell\\Desktop\\012.jpg");
    Thread.sleep(3000);

	descriptionTxtBx.sendKeys(description);
    Thread.sleep(3000);
	saveBtn.click();
}
}

