package week4day1assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mythraa {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement mo1 = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(mo1).perform();
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		String titlecount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println(titlecount);
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("duke");
		driver.findElement(By.xpath("(//label[@class=' common-customCheckbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class=' common-customCheckbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite FilterDirectory-close')]")).click();
		WebElement brands = driver.findElement(By.xpath("//h3[text()='Duke']"));
		Thread.sleep(3000);
		WebElement mo2 = driver.findElement(By.xpath("//span[text()='Recommended']"));
		Actions a=new Actions(driver);
		a.moveToElement(mo2).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='sort-label '])[4]")).click();
		driver.findElement(By.xpath("//h4[@class='product-product']")).click();
		Set<String> wh1 = driver.getWindowHandles();
		List<String>w1=new ArrayList<String>(wh1);
		driver.switchTo().window(w1.get(1));
		File sc = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./myntra/snap2.png");
		FileUtils.copyFile(sc, des);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		driver.switchTo().window(w1.get(1));
		driver.close();
		driver.switchTo().window(w1.get(0));
		driver.close();
		Thread.sleep(1000);
		
	
	
	
	
	
	
	
	
	}
	

}
