package seleniumPrograms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	
	{
	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     driver.manage().window().maximize();
	}
	     
		
	@Test(priority=1)
	public void loginNoUsernamePasswordTest() throws InterruptedException
	
	{
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		       Thread.sleep(3000);
		
		Alert a1=driver.switchTo().alert();
		
		Assert.assertEquals(a1.getText(),"please enter a valid username");
		
		a1.accept();
		
	}
	
	   @Test(priority=2)
	   public void loginUsernameNoPasswordTest() throws InterruptedException
	   {
		   
		   
		 driver.findElement(By.xpath("//input[@id='login']")).sendKeys("reyaz06");
		       Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='proceed']")).click();
		 
		 Thread.sleep(3000);
		 
		 Alert a1=driver.switchTo().alert();
		 
		 Assert.assertEquals(a1.getText(),"please enter your password");
		 
		 a1.accept();
		 
	   }
	   
	   @AfterMethod
	   
	   public void teardown() throws InterruptedException
	   {
		   
		   Thread.sleep(3000);
		   driver.quit();
	   }
	   
}	   
	   
	   
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	 
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


