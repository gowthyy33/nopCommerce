package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterWebElement {
	WebDriver driver ;
	
	public RegisterWebElement(WebDriver driver) {
		this.driver = driver;
	}
	//register in main menu
	By register = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	
	//gender in register page
	By genderMale = By.xpath("//*[@id=\"gender-male\"]");
	By genderFemale = By.xpath("//*[@id=\"gender-female\"]");
	
	//name in register
	By firstName = By.xpath("//*[@id=\"FirstName\"]");
	By lastName = By.xpath("//*[@id=\"LastName\"]");
	
	
	//date of birth
	By day = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
	By month = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
	By year = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
	
	
	//email in register
	By emailInput = By.xpath("//*[@id=\"Email\"]");
	
	//companyName in register
	By companyName = By.xpath("//*[@id=\"Company\"]");
	
	
	//newsletter in registration
	By newsletter  = By.xpath("//*[@id=\"Newsletter\"]");
	
	
	//passWord in registration
	By passwordSet = By.xpath("//*[@id=\"Password\"]");
	By passwordCnf = By.xpath("//*[@id=\"ConfirmPassword\"]");
	
	//register button
	By registerBtn = By.xpath("//*[@id=\"register-button\"]");
	
	
	//gender
	public WebElement genderMale() {
		return driver.findElement(genderMale);
	}
	
	public WebElement genderFemale() {
		return driver.findElement(genderFemale);
	}
	
	
	//name
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	
	
	//dob
	public WebElement date() {
		return driver.findElement(day);
	}
	public WebElement month() {
		return driver.findElement(month);
	}
	
	public WebElement year() {
		return driver.findElement(year);
	}
	
	//email
	public WebElement emailReg() {
		return driver.findElement(emailInput);
	}
	
	
	//newsletter
	public WebElement newsletter() {
		return driver.findElement(newsletter);
	}
	
	//companyName
	public WebElement companyName() {
		return driver.findElement(companyName);
	}
	
	
	
	//password
	public WebElement passwordSet() {
		return driver.findElement(passwordSet);
	}
	
	public WebElement passwordCnf() {
		return driver.findElement(passwordCnf);
	}
	
	
	//registerBtn
	public WebElement registerBtn() {
		return driver.findElement(registerBtn);
	}
	
	
	//register in mainMenu
	public WebElement registerMain() {
		return driver.findElement(register);
	}
}
