package topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement oneWayRadio = driver.findElement(By.cssSelector("td input[value='OneWay']"));
		WebElement rndTrpRadio = driver.findElement(By.cssSelector("td input[value='RoundTrip']"));
		WebElement returnDateInput = driver.findElement(By.cssSelector("div #Div1"));
		
		System.out.println(returnDateInput.getAttribute("style"));
		
		rndTrpRadio.click();
		System.out.println(returnDateInput.getAttribute("style"));
		
		oneWayRadio.click();
		System.out.println(returnDateInput.getAttribute("style"));
		
		returnDateInput.click();
		System.out.println(returnDateInput.getAttribute("style"));
		
		driver.quit();
	}
}
