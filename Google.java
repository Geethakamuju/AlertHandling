package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\nitis\\Downloads\\firefox_win32\\chromedriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.youtube.com/");
	}

}
