package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		System.out.println(driver.findElement(By.cssSelector("a.logo-wrapper")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1")).getText());

		List<WebElement> elements = driver.findElements(By.cssSelector("div.navigation-container>a"));

		for (WebElement el : elements) {
			System.out.println(el.getText());
		}
		
		System.out.println("I am the best");
		driver.quit();
	}

}
