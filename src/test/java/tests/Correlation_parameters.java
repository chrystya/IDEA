package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

// Import package pageObject.*

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class Correlation_parameters {

  WebDriver driver;
  LoginPage objLogin;


  @BeforeTest

  public void setup() {

//    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpred\\Desktop\\sourses\\chromedriver.exe");

    System.setProperty("webdriver.chrome.driver", "/Users/kp/myproject/chromedriver.exe");
    driver = new ChromeDriver();
    objLogin = new LoginPage(driver);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://mclasshome.aws.wgen.net/reports/Correlation");
  }

  @Test

  public void test_Verify_Correlation_Parameters() {

    //System.out.println("Test");
    objLogin.loginToCI("muser47", "Abcd1234");


  }
}