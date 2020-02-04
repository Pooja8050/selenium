package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.in");
		 String a="pooja meaning";
		  driver.findElement(By.name("q")).sendKeys(a);
		  Thread.sleep(2000);
		  driver.findElement(By.name("btnK")).click();
	     String b=driver.findElement(By.name("q")).getAttribute("value");
		String s=driver.findElement(By.id("resultStats")).getText();
		driver.close();
		System.out.println(s);
	if(b.equals(a))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}

}
