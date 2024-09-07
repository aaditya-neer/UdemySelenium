package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String order = new String("1-Cucumber,2-Beetroot,2-Corn,1-Apple,2-Water Melon");
		int noOfItem = 0;
		String nameOfItem = new String();

		String[] items = order.split(",");

		System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> incItemCountBtns = driver.findElements(By.className("increment"));
		List<WebElement> addToCartBtns = driver.findElements(By.cssSelector(".product-action button"));
		
		for (String item : items) {
			noOfItem = Integer.parseInt(item.split("-")[0]);
			nameOfItem = item.split("-")[1];

			for (int i = 0; i < products.size(); i++) {

				if (products.get(i).getText().contains(nameOfItem)) {
					System.out.println("Location on page: "+(i+1));

					if (noOfItem != 1) {
						for (int j = 1; j < noOfItem; j++) {
							incItemCountBtns.get(i).click();
						}
					}
					addToCartBtns.get(i).click();
					break;
				}
			}

		}
		driver.quit();
	}

}
