package week4day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement ac = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement ac1 = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(ac, ac1).perform();
	}

}
