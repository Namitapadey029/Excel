package newtab;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class newtab2 {
	WebDriver driver;
	@BeforeTest
	public void first() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namita Pandey\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	@Test
    driver.findElement(By.xpath("\"//button[@class='btn btn-info']\"")).click();
	String child_url = "https://www.selenium.dev/";
	
	String parent_url = driver.getWindowHandle();
	
	 Set<String> all_url = driver.getWindowHandles();
	
	 for(String single_url : all_url) {
		 driver.switchTo().window(single_url);
		 if(driver.getCurrentUrl().contains(child_url)) {
			 break;
		 }
	 }
	
	
	 driver.findElement(By.xpath("//span[text()='Downloads']")).click();

	}


}
