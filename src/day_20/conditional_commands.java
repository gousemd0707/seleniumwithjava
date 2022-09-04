package day_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_commands {
     		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/register");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// isDisplayed isEnabled
			WebElement search_box=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
			System.out.println("displayed:"+search_box.isDisplayed()); 
			System.out.println("Enbled :"+search_box.isEnabled());
			WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
			WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
			System.out.println(male.isSelected());
			System.out.println(female.isSelected());
			male.click();
			System.out.println(male.isSelected());
			female.click();
			System.out.println(female.isSelected());
			  
		
			
     		}}
			

