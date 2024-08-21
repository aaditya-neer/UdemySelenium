package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AsgnOneCheckBoxes {
	public static void main(String[] args) {
		// TODO Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
		checkBox1.click();
		Assert.assertTrue(checkBox1.isSelected());
		
		checkBox1.click();
		Assert.assertFalse(checkBox1.isSelected());
		
		driver.quit();
	}
}