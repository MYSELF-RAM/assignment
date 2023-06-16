package week4day1assignment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.win32.WinNT.HANDLE;
public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_3c01r1321r_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=610714031509&hvpos=&hvnetw=g&hvrand=8148588954374348596&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061894&hvtargid=kwd-32679660&hydadcr=14454_2316419");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("one plus 9 pro",Keys.ENTER);
		String text2 = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(text2);
		String text = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color')]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		String rate = driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]")).getText();
		System.out.println(rate);
		driver.findElement(By.linkText("(Renewed) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String>w1=new ArrayList<String>(wh);	
		driver.switchTo().window(w1.get(1));
		String text3 = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[2]")).getText();
		System.out.println("rating"+text3);
		File sc = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./screen/snap.png");
		FileUtils.copyFile(sc, des);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		String text4 = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println(text4); 
		String rp1 = text2.replace(",", "");
		int p1 = Integer.parseInt(rp1);
		String p2 = text4.replace("₹", "");
		String p3 = p2.replace(",", "");
		float p4 = Float.parseFloat(p3);
		if(p1-p4==0) {
			System.out.println("price valid");
		}
		else {
			System.out.println("invalid price");
		}
		
		driver.switchTo().window(w1.get(1));
		driver.close();
		driver.switchTo().window(w1.get(0));
		driver.close();
		Thread.sleep(1000);
		
		
		
		
}}



