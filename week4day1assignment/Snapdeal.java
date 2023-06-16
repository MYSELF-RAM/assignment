package week4day1assignment;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("sports shoes",Keys.ENTER);
		String result = driver.findElement(By.xpath("//span[@class='nnn']")).getText();
		System.out.println(result);
		driver.findElement(By.xpath("//div[text()='Sports Fashion']")).click();
		driver.findElement(By.xpath("//div[text()=\"Men's Sports Fashion\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Men's Sports Footwear\"]")).click();
		driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']")).click();
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@data-index='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("999",Keys.ENTER);	
		//driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow ')]")).click();
		Thread.sleep(6000);
		WebElement ac = driver.findElement(By.xpath("//p[text()='Vector X RAZOR 2.0 Red Training Shoes']"));
		Actions x=new Actions(driver);
		x.moveToElement(ac).perform();
		driver.findElement(By.xpath("//div[contains(@class,'quick-view-bar')]")).click();
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println(price);
		String dis = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(dis);
		File sc = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./snapdeal/snap1.png");
		FileUtils.copyFile(sc, des);
		Thread.sleep(3000);
		driver.close();
		
		//	
		
		
		
		
		
		
		
		
		
		
	}

}

