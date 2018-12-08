package com.viettel;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.lazada.LoginPage;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	WebDriver driver ;
	@Test
	public void firstTest()

	{
		System.setProperty("webdriver.chrome.driver","D:\\Viettel\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.1905e1820DK0Si&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
		LoginPage t = new LoginPage(driver);
		t.txtUsername.sendKeys("usernametest");
		t.txPassword.sendKeys("pastest");
		t.btnSubmit.click();

	}


}
