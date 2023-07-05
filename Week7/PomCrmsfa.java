package Week7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomCrmsfa extends PomBase {
	public PomCrmsfa(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public PomLeads clickcrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new PomLeads(driver);
		
	}

}
