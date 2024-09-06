package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AsgnThreeLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
//		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//*[contains(text(),' User')]")).click();

		Select profile = new Select(driver.findElement(By.cssSelector("#login-form select")));
		profile.selectByValue("stud");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	}
}
