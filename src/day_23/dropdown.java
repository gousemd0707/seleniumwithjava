package day_23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"input-country\"]"));
		Select drocountry=new Select(drop);
		drocountry.selectByVisibleText("Zambia");
		drocountry.selectByIndex(5);
		drocountry.selectByValue("6");
		
  List<WebElement>options=drocountry.getOptions();
  System.out.println("all the options:"+options.size());
   /*for(int i=0;i<options.size();i++)
   {
	   System.out.println(options.get(i).getText());
   }*/
  for(WebElement opt:options)
  
  {
	  System.out.println(opt.getText());
  }
	
		
		
       
	}

}
