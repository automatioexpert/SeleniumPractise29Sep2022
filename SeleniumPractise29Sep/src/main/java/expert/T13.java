package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T13 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zolotovalves.com/");
		System.out.println(driver.findElement(By.cssSelector("img[alt='Zoloto']")).isDisplayed());

	List<WebElement> lis=driver.findElements(By.cssSelector("ul#menu-main-menu>li"));
	
	for(WebElement li:lis) {
		System.out.println(li.getText());
	}
	System.out.println("I am the top expert on the Planet");
	driver.quit();
	}

}
