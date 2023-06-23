package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
//create artical service now
public class Createartical {
	@Test()
	public  void createartical() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// login service now
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dev115712.service-now.com/now/nav/ui/classic/params/target/ui_page.do%3Fsys_id%3D6f1f3185471721102ad07688c26d4334");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("@FiOJz9Qwe+6");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//new incident
		Shadow dom=new Shadow (driver);
		dom.setImplicitWait(20);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(10);
		dom.findElementByXPath("//input[@placeholder='Filter']").sendKeys("knowledge");
		Thread.sleep(3000);
		dom.findElementByXPath("//span[text()='Create New']").click();
		Thread.sleep(2000);
		WebElement f1 = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
		
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("automation");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);

		
		
		
		
		
		
		
		
		
	
	

	}

}
