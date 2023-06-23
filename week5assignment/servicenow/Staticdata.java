package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//static parameterization
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Staticdata {
	@Parameters({"url","uname","pass"})
	@Test
	public void staticparameterization(String url,String uname,String pass) {
	WebDriverManager.chromedriver().setup();
	// login service now
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(uname);
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pass);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
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

}
}