package seliniumw2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/radio.xhtml");   
		driver.findElement(By.xpath("//label[contains(@for,'idt87:console1:0')]")).click();
		driver.findElement(By.xpath("//label[contains(@for,'j_idt87:city2:0')]")).click();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[2]")).click();
		
		
}}