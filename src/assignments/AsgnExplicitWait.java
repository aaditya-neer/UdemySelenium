package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AsgnExplicitWait {
	@Test
	public void assnExplicitWait() {
		String country = "India";
		String countryPath = "//li/a[text()='" + country + "']";
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		List<WebElement> credential = driver.findElements(By.cssSelector("p.text-white b i"));

		String username = credential.get(0).getText();
		String password = credential.get(1).getText();

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();

		WebElement okButton = driver.findElement(By.id("okayBtn"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(okButton));
		okButton.click();

		Select userType = new Select(driver.findElement(By.xpath("//select")));
		userType.selectByVisibleText("Consultant");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		w.until(ExpectedConditions.titleContains("ProtoCommerce"));

		List<WebElement> addButtons = driver.findElements(By.xpath("//button[text()='Add ']"));

		for (WebElement addButton : addButtons) {
			addButton.click();
		}

		driver.findElement(By.cssSelector("li a.btn")).click();
		driver.findElement(By.cssSelector("button.btn-success")).click();

		driver.findElement(By.id("country")).sendKeys(country);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(countryPath)));
		driver.findElement(By.xpath(countryPath)).click();

		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();

		driver.quit();
	}
}
