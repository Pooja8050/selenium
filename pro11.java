package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro11 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.youtube.com/");
		  driver.findElement(By.id("search")).sendKeys("Jab Harry met sejal songs");
		  Thread.sleep(2000);
		  driver.findElement(By.id("search-icon-legacy")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[contains(text(),'Safar Full Video' )]")).click();
		

	}

}
