package topics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import utills.WebBrowser;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebBrowser.getDriver("edge");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.quit();
	}

}
