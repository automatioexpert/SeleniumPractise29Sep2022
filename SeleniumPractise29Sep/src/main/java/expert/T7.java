package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		driver.findElement(By.cssSelector("input[name='s']")).sendKeys("services" + Keys.ENTER);

		driver.findElement(By.cssSelector("li>a[href*='partners']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'OUR')]")).getText());

		List<WebElement> ele = driver.findElements(By.cssSelector("div.full-fold-hero-cta-wrapper>a"));

		for (WebElement el : ele) {
			System.out.println(el.getText());
		}
		driver.quit();

	}

}
