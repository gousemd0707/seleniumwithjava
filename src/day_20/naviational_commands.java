package day_20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naviational_commands {

		   public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/register");
			driver.get("https://www.amazon.in/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			

	}

}
