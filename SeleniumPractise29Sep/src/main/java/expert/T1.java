package expert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	@Test
	public void t1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.wait));
		driver.get("https://www.upm.com/");

		WebElement allowAll = driver.findElement(By.xpath("(//button[contains(text(),'Allow all')])[3]"));

		try {
			if (allowAll.isDisplayed()) {
				allowAll.click();
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		System.out.println(driver.findElement(By.cssSelector("span.an-logo-header__title-site-name")).isDisplayed());

		WebElement inv = driver.findElement(By.xpath("//span[contains(text(),'Investors')]"));

		Actions act = new Actions(driver);
		act.moveToElement(inv).perform();

		driver.findElement(By.xpath("//div[contains(text(),'Governance guidelines')]")).click();
		
		try {
		Thread.sleep(5);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("Mouse hovered");

	}
}
