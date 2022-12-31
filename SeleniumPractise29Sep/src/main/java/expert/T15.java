package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T15 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zolotovalves.com/");
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		System.out.println(driver.findElement(By.cssSelector("h1+h4")).getText());
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		driver.findElement(By.cssSelector("a[href*='credentials']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
