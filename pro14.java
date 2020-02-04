package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pro14
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 //Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 //Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		// Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 //Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Testing");
		driver.switchTo().alert().accept();
		
		
		
		
		 //driver.findElement(By.id("draggable"));
		// driver.switchTo().frame(0);
//		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//		 
//		 WebElement source=driver.findElement(By.id("draggable"));
//		 WebElement dest=driver.findElement(By.id("droppable"));
//		 
//		 Actions act=new Actions(driver);
//		 act.dragAndDrop(source, dest).build().perform();
//		 
//		 driver.switchTo().defaultContent();
//		 
//		 Thread.sleep(2000);
//		 driver.quit();
//		 driver.quit();                                                                                                                      
//		 
//		

	}

}
