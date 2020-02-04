package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pro12 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rediff.com/");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[2]")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("pooja badiger");//Full Name//
		 driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("hvfddfeyu");//mail id//
		 
		 driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("pooja123");//password//
		 
		 
		 
		// driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("pooja123");
		 driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("pooja123");
		 
		 driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input")).sendKeys("uerguwffqyaf");
		 driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[2]")).click();
		 
		  driver.findElement(By.xpath("//*[@src='http://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[text()='USA / Canada (+1)']")).click();

		  Thread.sleep(2000);
		  driver.findElement(By.id("mobno")).sendKeys("1234567890");
		 driver.findElement(By.className("nomargin")).click();
		 Thread.sleep(2000);
		 
		 Select s=new Select(driver.findElement(By.id("country")));
		 s.selectByVisibleText("Australia");
		 //driver.findElement(By.xpath("//*[@id=\"div_mob\"]/table/tbody/tr/td[3]/div[2]")).sendKeys();
		 Thread.sleep(2000);
		 //driver.close();
		 


	}

}
