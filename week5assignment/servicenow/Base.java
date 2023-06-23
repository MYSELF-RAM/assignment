package servicenow;
//parallel service now
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public ChromeDriver driver;
	@Test
	public void login() {
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

}
