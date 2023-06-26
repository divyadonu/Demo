package UdemyPratices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJavaAlerts {

	public static void main(String[] args) {
		String text= "Divya Gowda";
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		//to capture the text of the alert and write on console
		System.out.println(driver.switchTo().alert().getText());
		//when name is entered, click on alert, a alert popup comes with OK button but we cant inspect those so use alerts
		driver.switchTo().alert().accept();
		//by clicking on confirm buttons, we get popup with OK and cancel buttons(javascript alerts) displayed on page
		driver.findElement(By.id("confirmbtn")).click();
		//in alerts to press ok=accept, for cancel press=dismiss
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		

	}

}
