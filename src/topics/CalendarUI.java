package topics;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {
	@Test
	public void calendarInput() {
		
		String monthNumber = "15";
		String yearNumber = "2027";
		String dayNumber = "15";
		
		System.setProperty("webdriver.chrome.driver", "D://Learning//Selenium//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}

}
