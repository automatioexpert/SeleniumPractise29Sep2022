package expert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T11 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		driver.findElement(By.cssSelector("a[href*='login']")).click();
		System.out.println(driver.findElement(By.cssSelector("header.form-header>h1")).getText());
		driver.findElement(By.id("Details_FirstName")).sendKeys("Pinga3723");
		driver.findElement(By.id("Details_LastName")).sendKeys("Pinga Baliyari34883");
		driver.findElement(By.name("Details.Email")).sendKeys("tysd3747343737@ts.com");
		driver.findElement(By.id("js-password")).sendKeys("password347374");
		driver.findElement(By.cssSelector("a#js-toggle-password")).click();
		System.out.println("test passed!!");

	}

}
