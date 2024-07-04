package testng_testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public  class Autos {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void scenario1(String nameOfbrowser)
	{
		if(nameOfbrowser.equals("Chrome"));
		{
			driver = new ChromeDriver();
		}
		if(nameOfbrowser.equals("Firefox"));
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("Sachin Tendulkar");
		List<WebElement> suggestionlist = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int suggestioncount = suggestionlist.size();
		System.out.println(suggestioncount);
		suggestionlist.get(suggestioncount-6).click();
		driver.close();
	
	}

}
