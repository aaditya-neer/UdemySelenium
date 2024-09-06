package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Havintha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://havintha.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".popup-close span")).click();
		driver.findElement(By.xpath("*[@class='menu-opening']//*[contains(text(),'Hair Care')]")).click();
		
	}

}
//summary[@class='header__menu-item header__menu-item--top list-menu__item focus-inset']/span[contains(text(),'Hair Care')]
// .popup-close span