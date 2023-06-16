package week4day1assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(" https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement E = driver.findElement(By.xpath("//button[@title='Learn More']"));
		E.click();
		Set<String> wh = driver.getWindowHandles();
		List<String>n=new ArrayList<String>(wh);
		driver.switchTo().window(n.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(n.get(1));
		driver.close();
		driver.switchTo().window(n.get(0));
		driver.close();
		Thread.sleep(1000);
		

	}

}
