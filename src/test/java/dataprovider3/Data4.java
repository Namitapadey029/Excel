package dataprovider3;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data4 {
	WebDriver driver;
	
		@DataProvider(name = "getdata")
		
		public Object[][] getdata() throws EncryptedDocumentException, IOException{
			
			
		Data3 get = new Data3();
		
		Object[][] data = get.getdatafromexcel();
			return data;	
		}
		
	@BeforeMethod
	public void first() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namita Pandey\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

	}
	@Test(dataProvider = "getdata")
	public void test(String firstName, String lastName, String email, String companyName, String password, String confirmPassword) throws InterruptedException {
	   WebElement fname = driver.findElement(By.id("FirstName"));
		  Thread.sleep(2000);

	  WebElement lname = driver.findElement(By.id("LastName"));
	  Thread.sleep(2000);
	  

	  WebElement email1 = driver.findElement(By.id("Email"));
	  Thread.sleep(2000);
	  JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,350)", "");
  
	   WebElement company = driver.findElement(By.id("Company"));
		  Thread.sleep(2000);

	  WebElement password1 = driver.findElement(By.id("Password"));
	  Thread.sleep(2000);

	  WebElement confirmPassword1 = driver.findElement(By.id("ConfirmPassword"));
	  Thread.sleep(2000);


	  fname.sendKeys(firstName);
	  lname.sendKeys(lastName);
      email1.sendKeys(email);
	  company.sendKeys(companyName);
	  password1.sendKeys(password);
	  confirmPassword1.sendKeys(confirmPassword);
	  driver.findElement(By.id("register-button")).click();
	  Thread.sleep(2000);

	}


	@AfterMethod
	public void last() {
		driver.close();
	}
}
