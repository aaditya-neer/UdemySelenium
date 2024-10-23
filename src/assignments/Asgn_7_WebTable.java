package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Asgn_7_WebTable {
	@Test
	public void webTable() {
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		List<WebElement> columnHeaders = driver.findElements(By.xpath("//table[@name='courses']//th"));
		List<WebElement> secondRow = driver.findElements(By.xpath("//table[@name='courses']//tr[3]/td"));

		System.out.println(
				"Number of rows in the table: " + driver.findElements(By.xpath("//table[@name='courses']//tr")).size());
		System.out.println("Number of columns in the table: " + columnHeaders.size());

		for (int i = 0; i < columnHeaders.size(); i++) {
			System.out.println(columnHeaders.get(i).getText() + ": " + secondRow.get(i).getText());
		}

		driver.quit();
	}
}
