package Week7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pomdetails extends PomBase {
	public Pomdetails(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public PomVerify inputdetails() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAM");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RAM90S");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("i am 26");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");
		driver.findElement(By.className("smallSubmit")).click();
		return new PomVerify(driver);

	}

}
