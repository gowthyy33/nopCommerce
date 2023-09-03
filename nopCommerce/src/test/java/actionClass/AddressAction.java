package actionClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import webElement.AddressWebElement;
import webElement.LoginWebElement;

public class AddressAction {
	WebDriver driver = new ChromeDriver();
	
	AddressWebElement addMeth = new AddressWebElement(driver);
	LoginWebElement logMethod = new LoginWebElement(driver);

	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void invokeBrowser() {
	  	//addMeth = new AddressWebElement(driver);
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("116");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
  }
	
	
	@Test(priority = 0)
	public void loginclick() throws InterruptedException {

		driver.get("https://demo.nopcommerce.com/");
		logMethod.loginMenu().click();
		
	}
	
	@Test(priority = 1)
	public void passCreds() throws InterruptedException, IOException {
		
		//properties
		FileInputStream fileInput = new FileInputStream("./src/test/java/actionClass/cred.properties");
        Properties properties = new Properties();
        properties.load(fileInput);
        
        
        String gmail = properties.getProperty("username");
        String pass = properties.getProperty("password");
		
		
		
		 logMethod.emailLogin().sendKeys(gmail); 
		 Thread.sleep(3000);
		 logMethod.passwordLogin().sendKeys(pass); 
		 Thread.sleep(3000);
		 
}
	
	@Test (priority = 2)
	public void login() throws InterruptedException {
		logMethod.loginBtn().click();
		Thread.sleep(3000);		
	}
	
	@Test(priority = 3)
	public void openMyAcc() throws InterruptedException {
		
		driver.get("https://demo.nopcommerce.com/customer/info");
		Thread.sleep(1000);
		addMeth.accountMain().click();
		Thread.sleep(2000);	
	}
	
	@Test(priority=4)
	public void clickAdd() throws InterruptedException {
		
		
		addMeth.addressOption().click();
		Thread.sleep(2000);
		addMeth.addNewAddress().click();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=5)
	
	public void detailAdding() throws IOException, InterruptedException {
		
		FileInputStream fileInput = new FileInputStream("./src/test/java/actionClass/cred.properties");
        Properties properties = new Properties();
        properties.load(fileInput);
        
        addMeth.firstNameAdd().sendKeys(properties.getProperty("fNameAdd"));
        addMeth.lastNameAdd().sendKeys(properties.getProperty("lNameAdd"));
        addMeth.emailAdd().sendKeys(properties.getProperty("mailAdd"));
        Thread.sleep(2000);
        addMeth.companyAdd().sendKeys(properties.getProperty("companyAdd"));
        addMeth.cityAdd().sendKeys(properties.getProperty("cityAdd"));
        addMeth.addLine1().sendKeys(properties.getProperty("addLine1"));
        addMeth.addLine2().sendKeys(properties.getProperty("addLine2"));
        addMeth.zipAdd().sendKeys(properties.getProperty("zipAdd"));
        addMeth.phoneNumber().sendKeys(properties.getProperty("phoneNumberAdd"));
        
        Select selCountry = new Select(addMeth.countryAdd());
        //Select selState = new Select(addMeth.stateAdd());
        
        selCountry.selectByValue("133");
         
        Thread.sleep(2000);
       
        addMeth.saveBtn().click();
        
	}
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
