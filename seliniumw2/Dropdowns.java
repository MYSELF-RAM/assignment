package seliniumw2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/select.xhtml");   
		WebElement dd=driver.findElement(By.className("ui-selectonemenu"));
		Select option=new Select(dd);
		option.selectByVisibleText("Selenium");
		driver.findElement(By.id("j_idt87:country")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:city_label")).click();
		driver.findElement(By.id("j_idt87:city_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'ui-button')])[1]")).click();
		driver.findElement(By.xpath("//li[contains(@data-item-value,'Selenium WebDriver')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.id("j_idt87:lang_1")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@role='combobox'])[4]")).click();
		driver.findElement(By.xpath("//li[@data-label='One']")).click();
		Thread.sleep(5000);
			
			
}}
