package dataprovider3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[]args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namita Pandey\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
      drop.click();
      Select slct = new Select(drop);
      slct.selectByIndex(1);
      slct.selectByIndex(2);
      slct.selectByIndex(3);
}
	}


