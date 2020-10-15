package practice.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage   //Stores the common element
{
@FindBy (xpath="//a[text()='Products']")
private WebElement productEle;

public BasePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getProductEle() {
	return productEle;
}


}
