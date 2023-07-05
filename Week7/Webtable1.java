package Week7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://html.com/tags/table/");
		List<WebElement> rowcount = driver.findElements(By.xpath("//div[@class='related-pages']/table/tbody/tr/td[1]"));
		int row = rowcount.size();
		System.out.println("total row: "+row);
		List<WebElement> cellcount = driver.findElements(By.xpath("//div[@class='related-pages']/table/tbody/tr/td"));
		int cell = cellcount.size();
		System.out.println("total coloumn: "+cell);
	}

}
