package Countries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi.ECVKO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class country {
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://preprod.galxzee.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.linkText("United Kingdom")).click();

		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("mLogin")).sendKeys("apraveen5577@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mPassword")).sendKeys("praveena5775");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-success pull-right\"]")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a/span/img[2]/..")).click();
		Thread.sleep(5000);
		Set<String> handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parentid = (String)it.next();
		String childid = (String)it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.id("locSearch")).sendKeys("hii");
		driver.findElement(By.partialLinkText("Add")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Select")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Automobiles")).click();
		driver.findElement(By.linkText("Cars")).click();
		driver.findElement(By.id("postTypeId-2")).click();
		driver.findElement(By.id("title")).sendKeys("cars");
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("carsss");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("price")).sendKeys("200000");
		driver.findElement(By.id("select2-cityId-container")).click();
		driver.findElement(By.className("select2-search__field")).sendKeys("mo");
		driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[text()='Morley, City and Borough of Leeds']")).click();
		driver.findElement(By.id("phone")).sendKeys("9887234567");
		driver.findElement(By.xpath("//div//button[@class='js-cookie-consent-agree cookie-consent__agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//fieldset//div[@class='form-group row pt-3']/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='file-drop-zone-title']")).click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	    driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.xpath("//a[@id='skipBtn']")).click();
		driver.quit();
		
	}

}  
