package expert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T12 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/source-signpost");
	
		driver.findElement(By.xpath(".//a[contains(text(),'Go to NBS Source')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'specify construction')]")).getText());
		
		System.out.println("I am the best expert on the Planet");
		driver.quit();

	}

}
