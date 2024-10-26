package exercise;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTable {
	@Test
	public void filterTableStream() {
		String item = "Rice";
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.id("search-field")).sendKeys(item);

		List<WebElement> itemListActual = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> itemListExpected = itemListActual.stream().filter(s -> s.getText().equalsIgnoreCase(item))
				.collect(Collectors.toList());

		Assert.assertTrue(itemListActual.equals(itemListExpected));

		driver.quit();

	}
}
