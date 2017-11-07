package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

// Import package pageObject.*

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AssessmentsSelectionPage;
import pageObjects.LoginPage;
import pageObjects.Correlation_page;
import org.testng.Assert;


public class Correlation_parameters_test {

  WebDriver driver;
  LoginPage objLogin;
  AssessmentsSelectionPage objAssessment;
  Correlation_page objCorrelationPage;


  @BeforeTest

  public void setup() {

//    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpred\\Desktop\\sourses\\chromedriver.exe");

    System.setProperty("webdriver.chrome.driver", "/Users/kp/Selenium/chromedriver.exe");
    driver = new ChromeDriver();
    objLogin = new LoginPage(driver);
    objAssessment = new AssessmentsSelectionPage(driver);
    objCorrelationPage = new Correlation_page(driver);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://mclasshome.aws.wgen.net/reports/Correlation");
  }

  @Test

  public void test_Verify_Correlation_Parameters() throws InterruptedException {

    //System.out.println("Test");
    objLogin.loginToCI("muser47", "Abcd1234");
    objAssessment.selectDNext();
    Thread.sleep(5000);
    objCorrelationPage.clickViewReportBtn();
    Thread.sleep(5000);
    objCorrelationPage.getStudentsNumber();
    Assert.assertEquals(objCorrelationPage.getStudentsNumber(), "5 students with results in measures");


  }
}