package Week7;

import org.openqa.selenium.chrome.ChromeDriver;

public class PomVerify extends PomBase {
	public PomVerify(ChromeDriver driver) {
		this.driver=driver;
		
	}
	public PomVerify verify() {
		String title = driver.getTitle();
		System.out.println(title);
		return this;
		
	}

}
