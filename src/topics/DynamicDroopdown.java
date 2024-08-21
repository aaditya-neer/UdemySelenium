package topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utills.GetEnhanced;

public class DynamicDroopdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fromCode = "BLR";
		String toCode = "GOI";
		
		WebDriver driver = GetEnhanced.openUrl("Edge", "https://rahulshettyacademy.com/dropdownsPractise");
		
		WebElement fromCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		WebElement toCity = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		// single slash(/) is for one level depth that is parent to child.
		// double slash(//) is for any depth of grand child relation between tags.
		fromCity.click();		
		driver.findElement(By.xpath("//*[@id='marketCityPair_1']//*[@class='left1']//a[@value='"+fromCode+"']")).click();
	
		toCity.click();		
		driver.findElement(By.xpath("//*[@id='marketCityPair_1']//*[@class='right1']//a[@value='"+toCode+"']")).click();
		
		driver.quit();
	}
}
