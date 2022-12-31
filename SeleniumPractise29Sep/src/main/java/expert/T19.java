package expert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T19 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zolotovalves.com/");
		driver.findElement(By.cssSelector("a[href*='download']")).click();
		System.out.println(driver.findElement(By.xpath("//h6")).getText());
		WebElement sel = driver.findElement(By.cssSelector("select#downloadoptions"));
		Select select= new Select(sel);
		select.selectByIndex(2);
		System.out.println("I am the best ..Thank God!!");
	}

}
