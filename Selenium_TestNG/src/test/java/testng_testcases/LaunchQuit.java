package testng_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class LaunchQuit {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameofbrowser)
	{
		if(nameofbrowser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void quit()
	{
	
	}
	

}
