package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressWebElement {
	WebDriver driver;
	public AddressWebElement() {
		
	}
	public AddressWebElement(WebDriver driver) {
		this.driver = driver;
	}
	
	By myAccountMain = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By addressOpt = By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a");
	
	//address details
	
	By addNewAddress = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/button");

	By firstNameAdd = By.xpath("//*[@id=\"Address_FirstName\"]");
	By lastNameAdd = By.xpath("//*[@id=\"Address_LastName\"]");
	By emailAdd = By.xpath("//*[@id=\"Address_Email\"]");
	By companyAdd = By.xpath("//*[@id=\"Address_Company\"]");
	By countryAdd = By.xpath("//*[@id=\"Address_CountryId\"]");
	By stateAdd = By.xpath("//*[@id=\"Address_StateProvinceId\"]");
	By cityAdd = By.xpath("//*[@id=\"Address_City\"]");
	By addressLine1 = By.xpath("//*[@id=\"Address_Address1\"]");
	By addressLine2 = By.xpath("//*[@id=\"Address_Address2\"]");
	By zipAdd = By.xpath("//*[@id=\"Address_ZipPostalCode\"]");
	By phoneNumberAdd = By.xpath("//*[@id=\"Address_PhoneNumber\"]");
	
	By saveAddBtn = By.xpath("/html/body/div[6]/div[3]/div/div[2]/form/div/div[2]/div[2]/button");
	
	
	//methods
	public WebElement accountMain() {
		return driver.findElement(myAccountMain);
	}
	
	
	public WebElement addressOption() {
		return driver.findElement(addressOpt);
	}
	
	public WebElement addNewAddress() {
		return driver.findElement(addNewAddress);
	}
	
	public WebElement firstNameAdd() {
		return driver.findElement(firstNameAdd);
	}
	
	public WebElement lastNameAdd() {
		return driver.findElement(lastNameAdd);
	}
	
	public WebElement emailAdd() {
		return driver.findElement(emailAdd);
	}
	
	public WebElement companyAdd() {
		return driver.findElement(companyAdd);
	}
	
	public WebElement countryAdd() {
		return driver.findElement(countryAdd);
	}
	
	public WebElement stateAdd() {
		return driver.findElement(stateAdd);
	}
	
	public WebElement cityAdd() {
		return driver.findElement(cityAdd);
	}
	
	public WebElement addLine1() {
		return driver.findElement(addressLine1);
	}
	
	public WebElement addLine2() {
		return driver.findElement(addressLine2);
	}
	
	public WebElement zipAdd() {
		return driver.findElement(zipAdd);
	}
	
	public WebElement phoneNumber() {
		return driver.findElement(phoneNumberAdd);
	}
	
	public WebElement saveBtn() {
		return driver.findElement(saveAddBtn);
	}
}