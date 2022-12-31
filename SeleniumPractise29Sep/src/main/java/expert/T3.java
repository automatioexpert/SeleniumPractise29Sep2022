package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.upm.com/");

		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Renewable')]")).getText());

		List<WebElement> prs = driver.findElements(By.cssSelector("p.ingress"));
		for (int i = 0; i < prs.size(); i++) {
			System.out.println(prs.get(i).getText());
		}

		driver.findElement(By.cssSelector("button.an-action__link-button.btn--reset")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Services" + Keys.ENTER);
		System.out.println("I am the best Expert on the Planet..Thank You God!!");

		Thread.sleep(5);

		driver.close();
	}

}
