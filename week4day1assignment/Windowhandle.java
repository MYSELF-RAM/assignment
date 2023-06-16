package week4day1assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> w1 = driver.getWindowHandles();
		List<String>wh=new ArrayList<String>(w1);
		driver.switchTo().window(wh.get(1));
		String title = driver.getTitle();
		System.out.println(title);
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
