package topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utills.GetEnhanced;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = GetEnhanced.openUrl("Edge","https://rahulshettyacademy.com/dropdownsPractise");
		
		List<WebElement> checkBoxes= driver.findElements(By.cssSelector("#discount-checkbox div input"));
		List<WebElement> boxLabels= driver.findElements(By.cssSelector("#discount-checkbox div label"));
		
		for(int i=0; i<checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
			for(int j=0; j<checkBoxes.size(); j++) {
				if(checkBoxes.get(j).isSelected()) {
					System.out.println("# '"+boxLabels.get(j).getText()+"' is selected.");
				}
			}
			Assert.assertTrue(checkBoxes.get(i).isSelected());
		}		
		driver.quit();
	}

}
