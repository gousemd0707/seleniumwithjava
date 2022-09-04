package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame")	;
		driver.findElement(By.linkText("AbstractDriverOptions")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Package")).click();
		
		//packageListFrame
		//packageFrame
		//classFrame
		
	}

}
