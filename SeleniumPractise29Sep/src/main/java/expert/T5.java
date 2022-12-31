package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		driver.findElement(By.cssSelector("input[name='s']")).sendKeys("services" + Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Search Results']")).getText());

		List<WebElement> ele = driver.findElements(By.cssSelector("div.cell-half-width.vertical-align-middle"));
		for (WebElement e : ele) {
			System.out.println(e.getText());
		}

		List<WebElement> titles = driver.findElements(By.cssSelector("div.tile-title>a"));
		for (WebElement title : titles) {
			System.out.println(title.getText());
		}
		driver.quit();
	}

}
