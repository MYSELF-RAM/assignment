package Week7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomCreate extends PomBase{
	public PomCreate(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public Pomdetails createlead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new Pomdetails(driver);
	}
	public PomEditlead editlead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new PomEditlead(driver);
	}

}
