package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginWebElement {
	WebDriver driver;
	
	public LoginWebElement(WebDriver driver) {
		this.driver = driver;
	}

	//login link in main menu
	By LoginMenu = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	
	//login credentials	
	By emailLogin = By.xpath("//*[@id=\"Email\"]");
	By passwordLogin = By.xpath("//*[@id=\"Password\"]");
	
	//remember me & loginbtn
	By rememberMe = By.xpath("//*[@id=\"RememberMe\"]");
	By loginBtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
	
	//forget password complete elements
	By forgetPassword = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a");
	By recoveryMail = By.xpath("//*[@id=\"Email\"]");
	By recoverBtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button");
	By emailNotFound = By.xpath("//*[@id=\"bar-notification\"]/div/p");
	//fgyg
	
	
	
	
	
}
