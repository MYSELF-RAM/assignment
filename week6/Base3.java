package week6;
//two excel with test case
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base3 {
	public String Filename;
	public ChromeDriver driver;
	@Parameters({"url","uname","pass"})
	  @Test
  public void stat(String url,String uname,String pass) {
	WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);      
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		}
	@DataProvider(name="getdata")
	public String[][] fetchdata() throws IOException{
			String[][] rd=Excel3.readdata(Filename);
			return rd;
		
	}


}
