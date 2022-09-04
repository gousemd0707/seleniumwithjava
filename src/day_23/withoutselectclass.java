package day_23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselectclass {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		List<WebElement>option	=driver.findElements(By.xpath("//select[@id=\"input-country\"]//option"));
		// to find all options
		/*for(WebElement opt:option)
		{
			System.out.println(opt.getText());
		}*/
		// to find the size of all option
		System.out.println("Size of all option:"+option.size());
		//select the perticular option from dropdown
		 for(WebElement opt:option  )
		 {
			 if(opt.getText().equals("Zambia") )
			 {
				 opt.click();
				 break;
			 }
		 }
		
		

	}

}
