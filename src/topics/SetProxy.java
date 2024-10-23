package topics;

import java.time.Duration;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SetProxy {
	@Test
	public void setProxyExample() {
System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("localhost:8888");
		
		options.setCapability("proxy", proxy);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionKey");
		
	}
}
