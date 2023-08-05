package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoopencart {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void mouseoverTest()
	{
	    
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")))
			  .pause(Duration.ofSeconds(3))
	          .click(driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']")))
	          .build()
	          .perform();
	}
	
	
	@AfterMethod
	
	public void teardown() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}	
		
}		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


