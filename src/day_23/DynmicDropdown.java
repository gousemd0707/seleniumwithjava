package day_23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynmicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("selenium");
		Thread.sleep(5000);
		
		
		List<WebElement>options=driver.findElements(By.xpath("//li[@role=\"presentation\"]//div[@role=\"option\"]"));
		/*get text method
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}*/
		//select options
		for(WebElement opt:options)
		{
			if(opt.getText().equals("Selenium dev")) {
				opt.click();
				break;
				
			}
		}
		
		
		
		
 		
	}
	}
