package Week7;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr/td[1]"));
		int rowsize = row.size();
		
		for (int i = 1; i <=rowsize; i++) {
			String data = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]")).getText();
			System.out.println(data);
			System.out.println("******************************************");
			
		}


	}

}
