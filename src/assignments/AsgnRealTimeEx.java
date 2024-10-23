package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsgnRealTimeEx {
	@Test
	public void realTimeEx() {
		int i = 3;// Used to target the option to be selected.
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement optionToSelect = driver
				.findElement(By.xpath("//legend[text()='Checkbox Example']/following-sibling::label[" + i + "]"));
		optionToSelect.findElement(By.tagName("input")).click();

		String SelectedOption = optionToSelect.getText().trim();

		Select dropDownEx = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropDownEx.selectByVisibleText(SelectedOption);

		driver.findElement(By.id("name")).sendKeys(SelectedOption);
		driver.findElement(By.id("alertbtn")).click();

		Assert.assertTrue(driver.switchTo().alert().getText().contains(SelectedOption));

		driver.quit();
	}
}
