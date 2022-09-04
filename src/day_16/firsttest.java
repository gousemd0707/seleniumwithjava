package day_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("abc@xyz.com");
	driver.findElement(By.id("input-password")).sendKeys("abc123");
	driver.findElement(By.xpath("//input[@id='input-newsletter-yes']")).click();
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

}
