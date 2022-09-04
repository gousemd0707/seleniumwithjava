package day_20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_commands {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	    System.out.println("Title"+driver.getTitle());
		System.out.println("Source code:"+driver.getPageSource());
	    System.out.println("current url:"+driver.getCurrentUrl());
	    driver.close();
	   
		
		

	}

}
