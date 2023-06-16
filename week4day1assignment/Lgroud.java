package week4day1assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lgroud {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//assignment 1 create lead
		
		driver.get("http://leaftaps.com/opentaps/control/main");      
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String>n=new ArrayList<String>(wh);
		driver.switchTo().window(n.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='10220']")).click();
		driver.switchTo().window(n.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> w2 = driver.getWindowHandles();
		List<String>n2=new ArrayList<String>(w2);
		driver.switchTo().window(n2.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='10220']")).click();
		driver.switchTo().window(n2.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
	}

}
