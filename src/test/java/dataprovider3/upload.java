package dataprovider3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Namita Pandey\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/upload");
		
		WebElement upload = driver.findElement(By.xpath("//input[@id ='uploadFile']"));
		upload.sendKeys("C:\\Users\\HP\\Pictures");
		
		driver.findElement(By.xpath("//button[@id='uploadButton']")).click();
	}
	}


}
