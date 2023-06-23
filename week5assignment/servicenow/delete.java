package servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
//delete incident
public class delete extends Base {
	@Test
	public void del() throws InterruptedException {
		Shadow dom=new Shadow (driver);
		dom.setImplicitWait(20);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(20);
		dom.findElementByXPath("//input[@placeholder='Filter']").sendKeys("incident");
		dom.findElementByXPath("//span[text()='Open']").click();
		WebElement f1 = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("(//a[contains(@class,'formlink')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
