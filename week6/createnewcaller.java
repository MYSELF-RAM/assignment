package week6;
//service now excel
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
//create new caller
public class createnewcaller extends Baseservice {
	@DataProvider(name="getdata")
	public String[][] fetchdata() throws IOException{
			String[][] rd=Excelservice.getdata();
			return rd;
		
	}
	@Test(dataProvider="getdata")
	public  void service(String knowledge,String description) throws InterruptedException {
		//new incident
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys(knowledge);
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys(description);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		
	}

}
