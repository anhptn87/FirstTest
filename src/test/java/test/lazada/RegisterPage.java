package test.lazada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	@FindBy(xpath = "//div[contains(@class,'mod-input-phone')]/input")
	public WebElement txtPhonenumber;
	@FindBy(xpath = "//span[contains(@class,'btn_slide')]")
	public WebElement btnSlide;
	@FindBy(xpath = "//div[contains(@class,'mod-input-password')]/input")
	public WebElement txtPassword;
	@FindBy(id = "month")
	public WebElement sltMonth;
	@FindBy(id = "day")
	public WebElement sltDay;
	@FindBy(id = "year")
	public WebElement sltYear;
	@FindBy(id = "gender")
	public WebElement sltGender;
	@FindBy(xpath = "//div[contains(@class,'mod-input-name')]/input")
	public WebElement txtFullname;
	@FindBy(xpath = "//div[contains(@class,'mod-input-email')]/input")
	public WebElement txtEmail;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement btnSignup;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
}
