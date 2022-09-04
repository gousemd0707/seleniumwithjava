package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

         public class innerframes {
	     public static void main(String[] args) {
	   	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		 WebElement outerframe =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		 driver.switchTo().frame(outerframe);
		 
		 WebElement innerframe = driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
		 driver.switchTo().frame(innerframe);
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gouse");
		 
         //SingleFrame
	}

}



