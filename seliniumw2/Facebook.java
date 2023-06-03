package seliniumw2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("D");
		driver.findElement(By.xpath(" //input[@name='reg_email__']")).sendKeys("ram1397");
		driver.findElement(By.xpath(" (//input[@type='password'])[2] ")).sendKeys("1234");
		
		WebElement dd=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select option=new Select(dd);
		Select months=new Select(month);
		Select years=new Select(year);
		
		option.selectByVisibleText("1");
		months.selectByVisibleText("Mar");
		years.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		Thread.sleep(2000);
		
	}

}


