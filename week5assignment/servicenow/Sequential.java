package servicenow;
//sequential servicenow application
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Sequential {
	public 	ChromeDriver driver;
	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		// login service now
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://drive.google.com/");
		driver.get("https://dev115712.service-now.com/now/nav/ui/classic/params/target/ui_page.do%3Fsys_id%3D6f1f3185471721102ad07688c26d4334");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("@FiOJz9Qwe+6");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	}
	@Test
	public void n() throws InterruptedException{
		//new incident
				Shadow dom=new Shadow (driver);
				dom.setImplicitWait(20);
				dom.findElementByXPath("//div[text()='All']").click();
				dom.setImplicitWait(10);
				dom.findElementByXPath("//a[@aria-label='Incidents']").click();
				WebElement f1 = dom.findElementByXPath("//iframe[@title='Main Content']");
				driver.switchTo().frame(f1);
				driver.findElement(By.xpath("//button[text()='New']")).click();
				String num = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
				System.out.println(num);
				driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("testing");
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				Thread.sleep(3000);

		
		
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
		
	}

}
