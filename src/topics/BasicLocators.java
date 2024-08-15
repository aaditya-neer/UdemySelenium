package topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utills.WebBrowser;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Neeraj Kumar";
		String Email = "test.testing@test.com";
		String phone = "8546582654";
		String password = new String();
		
		WebDriver driver = WebBrowser.getDriver("Edge");
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement forgotPass = driver.findElement(By.partialLinkText("Forgot your"));
		WebElement nameInput = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement emailInput = driver.findElement(By.cssSelector("input[placeholder='Email']"));
		WebElement phoneInput = driver.findElement(By.cssSelector("input[placeholder*='Phone']"));
		WebElement resetLogin = driver.findElement(By.className("reset-pwd-btn"));

		forgotPass.click();
		nameInput.sendKeys(name);
		emailInput.sendKeys(Email);
		phoneInput.sendKeys(phone);
		resetLogin.click();
		
		WebElement infoMessage = driver.findElement(By.className("infoMsg"));
		WebElement goToLogin = driver.findElement(By.className("go-to-login-btn"));
		
		password = getPassword(infoMessage.getText());
		
		goToLogin.click();
		
		WebElement username = driver.findElement(By.id("inputUsername"));
		WebElement passwordIn = driver.findElement(By.name("inputPassword"));
		WebElement login = driver.findElement(By.className("signInBtn"));		
		
		username.sendKeys(name);
		passwordIn.sendKeys(password);
		login.click();
		
		String successmsg = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
		
		Assert.assertEquals(driver.findElement(By.cssSelector(".login-container h2")).getText(), "Hello "+name+",");
		Assert.assertEquals(successmsg, "You are successfully logged in.");
		
		WebElement logoutBtn = driver.findElement(By.xpath("//button[text()='Log Out']"));
		
		logoutBtn.click();
		
		driver.quit();
	}
	
	public static String getPassword(String s) {
		String[] sa = s.split("'");
		return sa[1];
	}
}