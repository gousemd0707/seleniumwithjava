package day_20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands {


		       public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				
				driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			    Thread.sleep(5000); 
			   
				
	}

}
