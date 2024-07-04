package testng_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit {
	@Test
	public void login_to_amazon()
	{
	
		WebElement un = driver.findElement(By.id("ap_email"));
		un.sendKeys("9886790589");
		WebElement un_cont = driver.findElement(By.id("continue"));
		un_cont.click();
		WebElement un_pwd = driver.findElement(By.id("ap_password"));
		un_pwd.sendKeys("Welcome@100");
		WebElement un_sign = driver.findElement(By.id("signInSubmit"));
		un_sign.click();
		
	
		
	}
	

}
