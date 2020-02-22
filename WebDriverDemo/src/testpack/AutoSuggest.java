package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
	int i=1;

	//For Conflicts
	//Test 123
	/*
	while(i<5)
	{
	System.out.println("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul/li["+i+"]/div/div[2]/div/span");
	i++;
	}*/
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("Selenium Training");
	//Thread.sleep(3000);
	while(driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul/li["+i+"]/div/div[2]/div/span")).size() == 1)
	{
		System.out.println(driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/ul/li["+i+"]/div/div[2]/div/span")).getText());
		i++;
	}
	driver.close();
	}

}
