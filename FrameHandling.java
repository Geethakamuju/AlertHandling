  package seleniumPrograms;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		  driver.manage().window().maximize();
	}
	
	
		@Test
		public void Inframe() throws InterruptedException
		{
			
			
			driver.switchTo().frame("packageListFrame");
			List<WebElement> allLinksInFrame1=driver.findElements(By.tagName("a"));
			for(WebElement link:allLinksInFrame1)
			{
				System.out.println(link.getText());
			}
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='allclasses-frame.html']")));
			List<WebElement> allLinksInFrame2=driver.findElements(By.tagName("a"));
			for(WebElement link:allLinksInFrame2)
			{
				System.out.println(link.getText());
			}
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='overview-summary.html']")));
			List<WebElement> allLinksInFrame3=driver.findElements(By.tagName("a"));
			for(WebElement link:allLinksInFrame3)
			{
				System.out.println(link.getText());
			}
			
			
			
					
		}
		
		@AfterMethod
		
		public void teardown() throws InterruptedException
		{
			
			Thread.sleep(3000);
			
			driver.quit();
			
		}
		
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


