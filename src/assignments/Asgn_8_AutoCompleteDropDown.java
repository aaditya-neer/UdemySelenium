package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asgn_8_AutoCompleteDropDown {
	@Test
	public void autoCompleteDropDown() {
		String country = "India";
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement countryInput = driver.findElement(By.id("autocomplete"));

		countryInput.sendKeys(country.substring(0, 3));
		driver.findElement(By.xpath("//li/div[text()='" + country + "']")).click();

		Assert.assertTrue(countryInput.getAttribute("value").equalsIgnoreCase(country));

		driver.quit();
	}
}