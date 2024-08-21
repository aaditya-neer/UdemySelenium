package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utills.GetEnhanced;

public class AutoSuggestDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country = "India";
		WebDriver driver = GetEnhanced.openUrl("edge", "https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		List<WebElement> suggested = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
		for(WebElement s: suggested) {
			if(s.getText().equalsIgnoreCase(country)) {
				s.click();
				break;
			}
		}
		driver.quit();
		
	}

}
