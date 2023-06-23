package week5assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//sequential method

public class leaftapapplication {
	 public ChromeDriver driver;
	 @BeforeMethod
	  public void precondition() {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");      
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
	  }

	
	
	@Test
  public void testcondition() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAM");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RAM90S");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("i am 26");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
  }
 
  @AfterMethod
  public void postcondtion() {
	 
			driver.close();

  

}}
