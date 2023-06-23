package week5assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class staticparameter {
	public ChromeDriver driver;
	@Parameters({"url","uname","pword"})
  @Test
  public void stat(String url,String Uname,String Pword) {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);      
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(Pword);
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAM");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RAM90S");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("i am 26");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
	  
	  
	  
	  
  }
}
