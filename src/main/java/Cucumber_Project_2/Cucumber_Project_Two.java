package Cucumber_Project_2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cucumber_Project_Two {
	@Test
	public void init() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.findElement(By.id("ControlID-18")).click();
		driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).click();

		driver.close();
	}
}
