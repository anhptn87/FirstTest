package test.lazada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//div[@class='mod-login-col1']//input[@type='text']")
	public WebElement txtUsername;
	@FindBy(xpath = "//div[@class='mod-login-col1']//input[@type='password']")
	public WebElement txPassword;
	@FindBy(xpath="//div[@class='mod-login-col2']//button[@type='submit']")
	public WebElement btnSubmit;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
