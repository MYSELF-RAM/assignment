package Week7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomLeads extends PomBase {
	public PomLeads(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public PomCreate clickleads() {
		driver.findElement(By.linkText("Leads")).click();
		return new PomCreate(driver);
	}

}
