package utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	public static WebDriver getDriver(String browser) {
		WebDriver driver;
		browser = browser.toLowerCase();
		switch(browser) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();		
		}
		return driver;
	}

}
