package topics;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import utills.WebBrowser;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebBrowser.getDriver("Chrome");
		
		driver.get("https://rahulshettyacademy.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
				
		driver.quit();
		
	}

}
