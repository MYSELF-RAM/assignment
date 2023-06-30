package week6;
//dynamic parameterization base1
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createlead extends Base1 {
	@DataProvider(name="getdata")
	public  String[][] fetchdata(){
		String [][] data=new String[2][3];
		data[0][0]="testleaf";
		data[0][1]="d";
		data[0][2]="Ram";
		data[1][0]="testleaf";
		data[1][1]="r";
		data[1][2]="nandha";
		return data;
	
		
	}
	
	 @Test(dataProvider="getdata")
	  public void create(String cname,String fname,String n) {
		 
		 driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(n);
			driver.findElement(By.className("smallSubmit")).click();


}}
