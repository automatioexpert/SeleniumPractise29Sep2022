package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T17 {
	public static void main(String[] args) throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zolotovalves.com/");
		driver.findElement(By.cssSelector("a[href*='manufacturing']")).click();
		List<WebElement> elements = driver.findElements(By.cssSelector("div.uk-thumbnail-caption"));
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}

		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		System.out.println("I am the best on the Planet");
		Thread.sleep(5000);
		driver.quit();
	}

}
