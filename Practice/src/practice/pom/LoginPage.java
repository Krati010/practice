package practice.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
@FindBy(name="user_name")
private WebElement usernameTxtBx;
@FindBy(name="user_password")
private WebElement pwdTxtBx;
@FindBy(id="submitButton")
private WebElement loginBtn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getUsernameTxtBx() {
	return usernameTxtBx;
}
public WebElement getPwdTxtBx() {
	return pwdTxtBx;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
public void loginDetails(String username, String pwd)
{
	usernameTxtBx.sendKeys(username);
	pwdTxtBx.sendKeys(pwd);
	loginBtn.click();
}
}
