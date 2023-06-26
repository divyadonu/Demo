package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttributeValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://admin-demo.nopcommerce.com/login");
		WebElement emailinputbox=driver.findElement(By.id("Email"));
		//emailinputbox.clear();
		//emailinputbox.sendKeys("admin123@gmail.com");
		
		//needs to capture the text from the inputbox
		System.out.println("Result from the getAttribute() method:"+ emailinputbox.getAttribute("value"));
		System.out.println("Result from the getText() method:"+ emailinputbox.getText());
		
		//login button using both getText() and getAttribute()
		WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		System.out.println(button.getText());
		// ex for getText()-logo we can inspect and write our own xpath if not there
		String title=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
		System.out.println(title);
		// now getText() the down page of defaults for admin area
		String topic= driver.findElement(By.xpath("//div[@class='topic-block-title']//h2")).getText();
		System.out.println(topic);
		
		
	}

}
