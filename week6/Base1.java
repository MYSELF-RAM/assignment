package week6;
//dynamic parameterization
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	public ChromeDriver driver;
	@Parameters({"url","uname","pass"})
	  @Test
  public void stat(String url,String uname,String pass) {
		//WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);      
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	  
	  
	  
	  
  }

}
