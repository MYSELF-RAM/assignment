package week4day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://leafground.com/drag.xhtml");
		WebElement a1 = driver.findElement(By.id("form:conpnl_content"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(a1, 50, 0).perform();
		Thread.sleep(3000);
		WebElement a2 = driver.findElement(By.id("form:drag_content"));
		WebElement a3 = driver.findElement(By.id("form:drop_content"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(a2, a3).perform();
		
		
	}

}
