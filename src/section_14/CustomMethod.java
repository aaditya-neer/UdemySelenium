package section_14;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CustomMethod {
	@Test
	public void customMethodStreams() {
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//th[1]")).click();

		List<WebElement> names = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> prices = names.stream().map(s -> getPrice(s)).collect(Collectors.toList());
		prices.forEach(s -> System.out.println(s));

		driver.quit();
	}

	private String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price = s.findElement(By.xpath("following-sibling::td")).getText();
		return price;
	}
}
