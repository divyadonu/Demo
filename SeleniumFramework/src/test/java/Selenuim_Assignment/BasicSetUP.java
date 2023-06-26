package Selenuim_Assignment;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BasicSetUP{
    public static WebDriver driver;
    public static Properties properties=new Properties();




   @Test(priority=1)
    public  void browser() throws Exception{
	   FileInputStream inputstream= new FileInputStream("C:\\Users\\dgt\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\config.properties");
	   properties.load(inputstream);
        System.out.println("Please Enter Browser Name: ");
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();    


   if(browser.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        
        else if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            
        }
    
                else if(browser.equalsIgnoreCase("Edge")){
                     
                        
                    WebDriverManager.edgedriver().setup();
                    
                    driver = new EdgeDriver();
                }
        else{
            
            throw new Exception("Browser is not correct");
        }



    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    
    }
    


}