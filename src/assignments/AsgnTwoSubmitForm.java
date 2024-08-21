package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AsgnTwoSubmitForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.cssSelector("input[name='name'].form-control")).sendKeys("Neeraj Kumar");
		driver.findElement(By.cssSelector("input[name='email'].form-control")).sendKeys("neeraj.kumar@abc.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select gender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("10-11-1989");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		driver.quit();
	}
}
