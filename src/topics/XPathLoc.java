package topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utills.WebBrowser;

public class XPathLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebBrowser.getDriver("Edge");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//parent to child and sibling traverse in Xpath(similar thing doesn't exist for CSS selectors).
		WebElement loginBtn = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
		//use /parent for parent tag similarly.
		System.out.println(loginBtn.getText());
	
		driver.quit();
	}

}