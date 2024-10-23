package exercise;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickOnMultiplLinks {
	@Test
	public void clickMultipleLinks() {
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		List<WebElement> links = driver.findElements(By.xpath("//*[@class='gf-li']/a"));

		for (WebElement link : links) {
			String openInTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			link.sendKeys(openInTab);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		it.next();

		for (int i = 0; i < windows.size() - 1; i++) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		driver.quit();
	}
}
