package week6;
//two excel with test case
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createlead3 extends Base3 {

	@BeforeTest
	public void sd() {
		Filename="CreateLead-1";
	}
	 @Test(dataProvider="getdata")
	  public void create(String companyName,String fName,String lName,String phNo) {
		 
		 driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);			
			driver.findElement(By.className("smallSubmit")).click();


}}
