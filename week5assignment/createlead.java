package week5assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//parallel
public class createlead extends baseclass {
  @Test
  public void create() {
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
