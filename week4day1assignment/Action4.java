package week4day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement i1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement i2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement i3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(i1).click(i2).click(i3).perform();
	
	}

}
