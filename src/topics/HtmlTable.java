package topics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int columnNumber = 0;
		
		System.setProperty("webdriver.chromr.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Print the fix header table.
		List<WebElement> headers = driver.findElements(By.xpath("//div[@class='tableFixHead']//th"));
		
		for(WebElement header: headers) {
			if(header.getText().equals("Amount")) {
				columnNumber = 1+headers.indexOf(header);
				break;
			}
		}
		
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='tableFixHead']//td["+columnNumber+"]"));
		
		for(WebElement row: column) {
			System.out.println(row.getText());
		}
		driver.quit();
	}

}
