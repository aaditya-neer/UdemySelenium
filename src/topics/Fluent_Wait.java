package topics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Fluent_Wait {
	@Test
	public void FluentWaitExample() {
		System.setProperty("webdriver.chromedriver.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.cssSelector("#start button")).click();
		
		WebElement helloMessage = driver.findElement(By.cssSelector("#finish h4"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(30))
								.pollingEvery(Duration.ofSeconds(3))
								.ignoring(NoSuchElementException.class);
		
		wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {	
				if (helloMessage.isDisplayed()) {
					return helloMessage;
				}else {
					return null;
				}				
			}
		});

		System.out.println("Text message: "+helloMessage.getText());
		driver.quit();
	}
}
