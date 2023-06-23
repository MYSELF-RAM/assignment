package servicenow;
//parallel servicenow
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class createincident extends Base{
	@Test
	public void create() throws InterruptedException {
		Shadow dom=new Shadow (driver);
		dom.setImplicitWait(20);
		dom.findElementByXPath("//div[text()='All']").click();
		dom.setImplicitWait(10);
		dom.findElementByXPath("//a[@aria-label='Incidents']").click();
		WebElement f1 = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		String num = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(num);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("testing");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000);
		//check incident are created
		driver.findElement(By.xpath("//button[contains(@class,'icon-menu')] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='context_item'])[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(num,Keys.ENTER);
		Thread.sleep(9000);
		WebElement num2 = driver.findElement(By.xpath("(//a[contains(@class,'formlink')])[1]"));
		String text = num2.getText();
		System.out.println(text.equalsIgnoreCase(num)+" new incident created");
			
	
	}

}
