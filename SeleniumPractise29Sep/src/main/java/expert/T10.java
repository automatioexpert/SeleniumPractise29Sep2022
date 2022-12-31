package expert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T10 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thenbs.com/");
		driver.findElement(By.cssSelector("a[href*='login']")).click();
		System.out.println(driver.findElement(By.cssSelector("header.form-header>h1")).getText());
		System.out.println(driver.findElement(By.cssSelector("header.form-header>h1+p")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'What is')]")).getText());
		driver.findElement(By.cssSelector("#Identification_Email")).sendKeys("user347374@test.com");
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		System.out.println(driver.findElement(By.cssSelector("header.form-header>h1+p")).getText());
		System.out.println("I am the World Champion!!");
		driver.quit();
	}

}
