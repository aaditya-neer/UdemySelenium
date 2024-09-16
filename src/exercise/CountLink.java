package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountLink {
	@Test
	public void linkCount() {
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Number of links in the page.
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Number of links in the footer of the page.
		System.out.println(driver.findElements(By.cssSelector("#gf-BIG a")).size());
		//Limiting the scope of driver
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		//Number of links in the footer of the page.
		System.out.println(footer.findElements(By.tagName("a")).size());
		//Number of links in the first column of the footer of the page.
		System.out.println(footer.findElements(By.xpath("//td[1]//li")).size());
		
		driver.quit();	
	}
}
