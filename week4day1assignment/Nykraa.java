package week4day1assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykraa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		WebElement mouseover = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseover).perform();
		driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[10]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//button[@class=' css-1aucgde']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Shampoo'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String filter = driver.findElement(By.xpath("//div[@class='css-rgv4i5']/span")).getText();
		System.out.println(filter);
		String text = driver.findElement(By.xpath("(//div[@class='css-3i7s5s']/span)[1]")).getText();
		System.out.println(text);
		String text2 = driver.findElement(By.xpath("(//div[@class='css-3i7s5s']/span)[2]")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		Set<String> wh1 = driver.getWindowHandles();
		List<String>w1=new ArrayList<String>(wh1);
		driver.switchTo().window(w1.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String price = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']/span)[2]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		String total = driver.findElement(By.xpath("(//span[@color='#001325'])[2]")).getText();
		//System.out.println(total);
		String r = total.replace("₹", "");
		System.out.println("total"+r);
		String m = price.replace("₹", "");
		int p1 = Integer.parseInt(m);
		System.out.println(p1);
		int p2 = Integer.parseInt(r);
		System.out.println(p2);
		if(p1-p2==0) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid price coz shipping price include with actual price");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
