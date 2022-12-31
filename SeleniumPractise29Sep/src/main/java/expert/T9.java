package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T9 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		WebElement support = driver.findElement(By.xpath("//a[contains(text(),'Support')]"));
		Actions act = new Actions(driver);
		act.moveToElement(support).click().perform();

		List<WebElement> texts = driver.findElements(By.cssSelector("article.nbs-nav-menu-group>a"));

		for (WebElement text : texts) {
			System.out.println(text.getAttribute("title"));
		}
		
		driver.quit();

	}

}
