package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T18 {
	public static void main(String[] args) throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zolotovalves.com/");
		driver.findElement(By.cssSelector("a[href*='career']")).click();
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Kindly')]")).getText());
		driver.quit();
	}

}
