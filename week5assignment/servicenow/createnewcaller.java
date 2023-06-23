package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
//create new caller
public class createnewcaller {

	public static void main(String[] args) throws InterruptedException {
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
		dom.findElementByXPath("//input[@placeholder='Filter']").sendKeys("callers");
		dom.findElementByXPath("//mark[text()='Callers']").click();
		WebElement f1 = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys("automation");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'formlink')])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
