package day21;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwaitdemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//declaration
		   Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(10))
			       .ignoring(NoSuchElementException.class);
		
		driver.get("https://www.google.com/");  
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	//driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
		//usage
		 WebElement link = mywait.until(new Function<WebDriver, WebElement>()
		 {
		     public WebElement apply(WebDriver driver)
		     {
		       return driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
		     }
		   }
		 );
		 link.click();
		
		driver.quit();
		
	}

}
