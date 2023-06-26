package Selenuim_Assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LoginSetup extends BasicSetUP{

	 public static void scroll(String path) {
         JavascriptExecutor js = (JavascriptExecutor) driver;
            
            //scrolling till TV APPLICATION Electronics
            WebElement Ele = driver.findElement(By.xpath(path));
            js.executeScript("arguments[0].scrollIntoView();", Ele);
           
            


   }
    @Test(priority=2)
    public void opening_amazon() {
    //opening Amazon site
    driver.get(properties.getProperty("url"));
    //Scroll Page
   /* JavascriptExecutor js = (JavascriptExecutor) driver;
   
    WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'Shop deals in top categories')]"));
    js.executeScript("arguments[0].scrollIntoView();", Element);*/
       
    }
    
    @Test(priority=3)
    public void scoll_till_brands() {
        //clicking on hamburger All menu
       driver.findElement(By.xpath(properties.getProperty("hamburger_All"))).click();
        scroll(properties.getProperty("scoll_tv_app_ele"));
        driver.findElement(By.xpath(properties.getProperty("scoll_tv_app_ele"))).click();
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    }
    @Test(priority=4)
    public void click_on_television() {
         // clicking on television
        driver.findElement(By.xpath(properties.getProperty("televion_click"))).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority=5)
    public void select_samsung_filter() {
        scroll(properties.getProperty("scoll_brands"));
         //selecting samsung brand to select checkbox and samsung 
        driver.findElement(By.xpath(properties.getProperty("select_samsung_brand"))).click();
        
    }
   
   
 


}