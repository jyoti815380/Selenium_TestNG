package testng_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void searching_on_amazon()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		WebElement search_tf = driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
			
	}

}
