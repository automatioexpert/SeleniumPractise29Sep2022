package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		for(int i=1;i<=10;i++)
		driver.get("https://www.youtube.com/watch?v=4l8Fr4F-a4I");
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.quit();
		
		
	}

}
