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

public class GreenKartSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();

		String[] itemsToAdd = { "Brocolli", "Cauliflower", "Apple", "Corn"};

		addItemsToCart(driver, itemsToAdd);
		driver.findElement(By.cssSelector(".cart-icon img")).click();
		driver.findElement(By.cssSelector(".cart-preview button")).click();

		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		WebDriverWait hold = new WebDriverWait(driver, Duration.ofSeconds(5));
		hold.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		
		driver.findElement(By.xpath("//div[@class='products']/div/button")).click();
		
		Select country = new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select")));
		
		country.selectByValue("India");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.cssSelector(".wrapperTwo button")).click();

		driver.quit();

	}

	private static void addItemsToCart(WebDriver driver, String[] itemsToAdd) {
		List<WebElement> itemName = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> addToCart = driver.findElements(By.cssSelector(".product-action button"));

		for (String item : itemsToAdd) {
			System.out.println(item);

			for (int i = 0; i < itemName.size(); i++) {
				if (itemName.get(i).getText().contains(item)) {
					addToCart.get(i).click();
					break;
				}
			}
		}
	}
}
