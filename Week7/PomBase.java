package Week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PomBase {
	public  ChromeDriver driver;
	@BeforeMethod
	public void url() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://leaftaps.com/opentaps/control/main");    
	}
	@AfterMethod
	public void closedriver() {
		//driver.close();
		
	}
}