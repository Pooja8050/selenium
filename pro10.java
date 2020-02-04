package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class pro10 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.com/");
		  driver.findElement(By.id("twotabsearchtextbox" )).sendKeys("fastrack watches for women");
		  Thread.sleep(3000);
		  driver.findElement(By.className("nav-input" )).sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[text()='FastRack']")).click();
	      Thread.sleep(2000);
	      //driver.findElement(By.xpath("//*[contains(text(),'silver')]")).click();
	    // driver.findElement(By.xpath("//*[contains(text(),'silver')][2]")).click();
	     Actions act=new Actions(driver);
	     act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	     Thread.sleep(2000);
	     
	      driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
	
		  
		  
		  
		 // driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		  		
		  //driver.findElement(By.id("login1")).sendKeys("xyz");
		  //driver.findElement(By.id("password")).sendKeys("123456");
		 // driver.findElement(By.name("proceed" )).click();
		  Thread.sleep(4000);
	}

}
