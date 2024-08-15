package topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utills.WebBrowser;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebBrowser.getDriver("chrome");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select currencySelect = new Select(currency);
		
		currencySelect.selectByIndex(3);
		System.out.println(currencySelect.getFirstSelectedOption().getText());
		
		currencySelect.selectByValue("INR");
		System.out.println(currencySelect.getFirstSelectedOption().getText());
		
		currencySelect.selectByVisibleText("AED");
		System.out.println(currencySelect.getFirstSelectedOption().getText());
				
//		driver.quit();		
	}

}
