package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		String tData = "oneway";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		//WebElement uname=driver.findElement(By.name("userName"));
		//uname.sendKeys("test");

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();

		//Radio option handling
		List<WebElement> tripTypes= driver.findElements(By.name("tripType"));
		System.out.println(tripTypes.size());

		for(int i = 0; i<tripTypes.size();i++)
		{
			System.out.println(tripTypes.get(i).getAttribute("value"));
			//Click radio option based on tData
			if (tripTypes.get(i).getAttribute("value").equals(tData))
			{
				tripTypes.get(i).click();
			}
		}

		//Check correct object is clicked
		for(int i=0; i<tripTypes.size();i++)
		{
			if (tripTypes.get(i).getAttribute("value").equals(tData))
				if(tripTypes.get(i).getAttribute("checked").equals("true")) 
				{
					System.out.println("OneWay Clicked");
				}

			//System.out.println(tripTypes.get(i).getAttribute("value") +"-->" +tripTypes.get(i).getAttribute("checked"));
		}


		Thread.sleep(3000);

		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.close();

	}

}
