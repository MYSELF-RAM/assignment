package servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;
//update incident
public class update extends Base{
@Test
public void upd() throws InterruptedException {
	Shadow dom=new Shadow (driver);
	dom.setImplicitWait(20);
	dom.findElementByXPath("//div[text()='All']").click();
	dom.setImplicitWait(20);
	dom.findElementByXPath("//a[@aria-label='Incidents']").click();
	Thread.sleep(2000);
	WebElement f1 = dom.findElementByXPath("//iframe[@title='Main Content']");
	driver.switchTo().frame(f1);
	driver.findElement(By.xpath("(//a[contains(@class,'formlink')])[1]")).click();
	WebElement select = driver.findElement(By.xpath("//select[@name='incident.urgency']"));
	Select s=new Select(select);
	s.selectByIndex(0);
	System.out.println("urgency->high");
	WebElement select1 = driver.findElement(By.xpath("//select[@name='incident.state']"));
	Select t=new Select(select1);
	t.selectByValue("2");
	System.out.println("state->inprogress");
	driver.findElement(By.xpath("//button[text()='Update']")).click();
	String title = driver.getTitle();
	System.out.println(title);

	
}
}
