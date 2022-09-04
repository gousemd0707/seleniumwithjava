package day_23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_cheakboxs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select all the cheak boxes
		List <WebElement>cheakboxes=driver.findElements(By.xpath("//input[@type='checkbox'and@class='form-check-input']"));
		System.out.println("Number of cheakboxes:"+cheakboxes.size());
		// how to Select  all the cheak bokes
		/*for(int i=0;i<cheakboxes.size();i++)
		{
			cheakboxes.get(i).click();
		}*/
		
		 /*for(WebElement chb:cheakboxes)
         {
	    chb.click();
         }*/
		//to cheak last two cheak boxes
     for(int i=cheakboxes.size()-2;i<cheakboxes.size();i++)
     {
    	cheakboxes.get(i).click(); 
     }
	//to cheak first two cheak boxes
     for(int i=0;i<cheakboxes.size();i++)
     {
    	 if(i<2)
    	 {
    		 cheakboxes.get(i).click();
    	 }
     }
     
     //clear all the cheak boxes
     for(WebElement ch:cheakboxes)
     {
    	 if(ch.isSelected())
    	 {
    		 ch.click();
    	 }
     }
     
     
	}

}
