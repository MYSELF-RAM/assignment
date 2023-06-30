package week6;
//service now excel
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Baseservice {
	public ChromeDriver driver;
	@Parameters({"url","uname","pass"})
	@Test
	public void login(String url,String uname,String pass) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// login service now
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Shadow dom=new Shadow (driver);
		dom.setImplicitWait(20);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(10);
		dom.findElementByXPath("//input[@placeholder='Filter']").sendKeys("callers");
		dom.findElementByXPath("//mark[text()='Callers']").click();
		WebElement f1 = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(f1);
	
	
	
		

	
	}

}
