package week5assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//parallel
public class editlead extends baseclass {
  @Test
  public void edit() {
	  driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	
  }
}
