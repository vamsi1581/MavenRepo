package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@Test
	public void login() {
		driver.get("https://google.com");
		System.out.println("Redirected to Google: Test is pass");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Closing browser");

	}
}
