package Countries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMOO {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://preprod.galxzee.com");
		driver.findElement(By.linkText("United Kingdom")).click();
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mLogin")).sendKeys("aira123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mPassword")).sendKeys("aira12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-success pull-right\"]")).click();
		Thread.sleep(2000);
		System.out.println("Login is Successfull");
		driver.quit();
}
	}
