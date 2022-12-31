package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T14 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zolotovalves.com/");
		System.out.println(driver.findElement(By.cssSelector("img[alt='Zoloto']")).isDisplayed());

		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("services"+Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		System.out.println(driver.findElement(By.cssSelector("h3+p>span")).getText());
		
		List<WebElement> h5s=driver.findElements(By.xpath("//h5"));
		for(WebElement h5:h5s) {
			System.out.println(h5.getText());
		}
		driver.close();
	}

}
