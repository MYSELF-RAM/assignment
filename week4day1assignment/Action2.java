package week4day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement a1 = driver.findElement(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(a1, 300, 50).perform();

	}

}
