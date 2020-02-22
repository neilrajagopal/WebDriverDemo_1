package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		String date = "10/January/2020";
		String[] dmy=date.split("/");
		
		//dmy[0]=10
		//dmy[1]=January
		//dmy[2]=2020
		driver.findElement(By.className("imgdp")).click();
		//Selection of year in Date picker
		//write code here
		
		//Selection of Month in Date Picker
		Thread.sleep(3000);
		while(true)
		{
			if(driver.findElement(By.className("ui-datepicker-month")).getText().equals(dmy[1]))
			{
				//exit
			break;
			}else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}	
		Thread.sleep(3000);
		}
		
		driver.findElement(By.linkText(dmy[0])).click();	
		Thread.sleep(3000);
		driver.close();
	}

}
