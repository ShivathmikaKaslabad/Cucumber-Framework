package BaseP1;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC1 {

public static WebDriver driver;
	
	public static void Browser_Launch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
	}
	public static void browser_close()
	{
		driver.close();
	}
}
