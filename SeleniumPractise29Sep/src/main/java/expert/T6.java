package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		driver.findElement(By.cssSelector("input[name='s']")).sendKeys("services" + Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Search Results']")).getText());

		driver.findElement(By.cssSelector("span.slider.round")).click();
		List<WebElement> elements = driver.findElements(By.cssSelector("div.tile-content"));

		for (WebElement el : elements) {
			System.out.println(el.getText());
		}

		System.out.println("I am the best expert on the Planet");
		driver.quit();
	}

}
