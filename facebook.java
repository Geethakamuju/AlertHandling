package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(10000);
        driver.findElement(By.name("birthday_day")).sendKeys("20");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_month")).sendKeys("oct");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_year")).sendKeys("2023");
        Thread.sleep(3000);
        
        
        
        driver.quit();
      
        
        
	}
 
}
