package day_20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementvsfindelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//findElement()
		
		//WebElement search_box=driver.findElement(By.id("small-searchterms"));
		//search_box.sendKeys("gouse");
		
	//WebElement ele=driver.findElement(By.xpath("//div[@class='footer']//a"));
		//System.out.println(ele.getText());
			
			//WebElement search_box=driver.findElement(By.id("small-searchterms"));
		//	search_box.sendKeys("gouse"); 
		
		//findElements()
		//List<WebElement>element=driver.findElements(By.xpath("//input[@id='small-searchterms']"));
		//element.get(0).sendKeys("phones");
		
		List<WebElement>elements=driver.findElements(By.xpath("//div[@class='footer']//a"));
		System.out.println(elements.size());
		/*for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}*/
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
		}
		
		
		
		
	}

			}

