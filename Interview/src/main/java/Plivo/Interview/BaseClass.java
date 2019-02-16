package Plivo.Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public static WebDriver driver=null;
	
	@BeforeTest
	@Parameters ({"browserName","URL"})
	public static void baseMethod(String browserName, String URL)
	{
		if (driver==null)
		{
			switch (browserName.toLowerCase())
			{
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver= new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver= new ChromeDriver();
				break;
			}
			
			driver.get(URL);
			driver.manage().window().maximize();
			
		}
	}
	
	/*@AfterTest
	public static void closeBrowser()
	{
		driver.quit();
	}*/
	
	public static void main(String[]args)
	{
		baseMethod("chrome","https://google.com");
	}
}
