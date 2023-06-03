//https://www.leafground.com/checkbox.xhtml
package seliniumw2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/checkbox.xhtml");   
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		WebElement text=driver.findElement(By.xpath("//span[text()='Disabled']"));
		System.out.println(text.getText());
		driver.findElement(By.id("j_idt87:multiple")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
}}  //          