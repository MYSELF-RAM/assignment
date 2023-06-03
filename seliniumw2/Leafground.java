package seliniumw2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("(//input[@role='textbox'])[1]")).sendKeys("ram");
		driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).sendKeys("theni");
		driver.findElement(By.xpath("(//input[@role='textbox'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@role='textbox'])[4]")).sendKeys("hi testleaf team");
		driver.findElement(By.xpath("(//input[@role='textbox'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@role='textbox'])[5]")).sendKeys("teaching level is good");
		driver.findElement(By.xpath("(//input[@role='textbox'])[6]")).sendKeys("ram1397");
		driver.findElement(By.xpath("//div[@class='col-12']/textarea")).sendKeys("i am 26");
		driver.findElement(By.xpath("//div[contains(@class,'col-12 mb-2')]/input")).sendKeys("email");
		driver.findElement(By.xpath("//span[contains(@class,'float')]/input")).sendKeys("ram90s");
		driver.findElement(By.xpath("//li[contains(@class,'autocomplete')]/input")).sendKeys("ram D");
		driver.findElement(By.xpath(" //input[contains(@class,'keyboard')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[2]")).sendKeys("my name is ram");
	}

}
