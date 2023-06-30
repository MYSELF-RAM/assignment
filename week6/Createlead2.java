package week6;
////test case with excel
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createlead2 extends Base2 {
	@DataProvider(name="getdata")
	public String[][] fetchdata() throws IOException{
			String[][] rd=Excel2.readdata();
			return rd;
		
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
