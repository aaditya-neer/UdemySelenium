package utills;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetEnhanced {
	public static WebDriver openUrl(String browser, String url) {
		WebDriver driver;
		browser = browser.toLowerCase();
		switch(browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D://Learning//Selenium//geckodriver//geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "D://Learning//Selenium//edgedriver//msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();		
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		return driver;
		
	}
}
