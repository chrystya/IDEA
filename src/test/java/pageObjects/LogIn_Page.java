package pageObjects;
 
import org.openqa.selenium.*;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
public class LogIn_Page {
 
        private static WebElement element = null;
 
    public static WebElement userName(WebDriver driver){
 
         element = driver.findElement(By.id("login-username"));
 
         return element;
 
         }
 
     public static WebElement password(WebDriver driver){
 
         element = driver.findElement(By.id("password"));
 
         return element;
 
         }
 
     public static WebElement submitButtton(WebDriver driver){
 
         element = driver.findElement(By.id("login-submit"));
 
         return element;
 
         }
 
}