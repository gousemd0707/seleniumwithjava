package day22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Alert myalert=driver.switchTo().alert();
	    myalert.sendKeys("GMG");
		myalert.accept();
		System.out.println(myalert.getText());
		myalert.dismiss();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
