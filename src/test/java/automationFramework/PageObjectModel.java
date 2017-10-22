package automationFramework;
 
     import java.util.concurrent.TimeUnit;
 
     import org.openqa.selenium.WebDriver;
 
     import org.openqa.selenium.firefox.FirefoxDriver;
 
     // Import package pageObject.*
 
     import pageObjects.Home_Page;
 
     import pageObjects.LogIn_Page;
 
public class PageObjectModel {
 
     private static WebDriver driver = null;
 
   public static void main(String[] args) {
 
     driver = new FirefoxDriver();
 
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
     driver.get("http://www.store.demoqa.com");
 
     // Use page Object library now
 
     Home_Page.lnk_MyAccount(driver).click();
 
     LogIn_Page.userName(driver).sendKeys("muser27");
 
     LogIn_Page.password(driver).sendKeys("Abcd1234");
 
     LogIn_Page.submitButtton(driver).click();
 
     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
     driver.quit();
 
     }
 
}