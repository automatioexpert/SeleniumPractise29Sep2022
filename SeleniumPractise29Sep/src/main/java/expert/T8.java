package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		driver.findElement(By.cssSelector("input[name='s']")).sendKeys("services" + Keys.ENTER);

		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();

		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Our mission')]")).getText());

		List<WebElement> elements = driver.findElements(By.xpath("//p[contains(text(),'construction')]"));

		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}
		
		driver 
		
		
		
		.quit();
	}

}
