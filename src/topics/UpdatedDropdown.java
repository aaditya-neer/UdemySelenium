package topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utills.WebBrowser;

public class UpdatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfAdult = 9;
		int noOfChild = 0;
		int noOfInfant = 4;
		WebDriver driver = WebBrowser.getDriver("Edge");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		WebElement passangers = driver.findElement(By.id("divpaxinfo"));
		WebElement addAdult = driver.findElement(By.id("hrefIncAdt"));
		WebElement addChild = driver.findElement(By.id("hrefIncChd"));
		WebElement addInfant = driver.findElement(By.id("hrefIncInf"));
		WebElement doneBtn = driver.findElement(By.id("btnclosepaxoption"));
		
		passangers.click();
		
		for(int a=1; a<noOfAdult; a++) {
			addAdult.click();
		}
		for(int c=0; c<noOfChild; c++) {
			addChild.click();
		}
		for(int i=0; i<noOfInfant; i++) {
			addInfant.click();
		}
		
		doneBtn.click();
		
		System.out.println(passangers.getText());
		
		driver.quit();
	}
}
