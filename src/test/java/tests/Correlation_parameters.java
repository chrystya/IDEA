package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Import package pageObject.*

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AssessmentsSelectionPage;
import pageObjects.LoginPage;
import pageObjects.ParametersSectionCorrelation;

public class Correlation_parameters {

  WebDriver driver;
  LoginPage objLogin;
  AssessmentsSelectionPage objAssessment;
  ParametersSectionCorrelation objCorrelationParam;


  @BeforeTest

  public void setup() {

//    System.setProperty("webdriver.chrome.driver", "C:\\Users\\kpred\\Desktop\\sourses\\chromedriver.exe");

    System.setProperty("webdriver.chrome.driver", "/Users/kp/Selenium/chromedriver.exe");
    driver = new ChromeDriver();
    objLogin = new LoginPage(driver);
    objAssessment = new AssessmentsSelectionPage(driver);
    objCorrelationParam = new ParametersSectionCorrelation(driver);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://mclasshome.aws.wgen.net/reports/Correlation");
  }

  @Test

  public void test_Verify_Correlation_Parameters() {

    //System.out.println("Test");
    objLogin.loginToCI("muser47", "Abcd1234");
    objAssessment.selectDNext();
    objCorrelationParam.openMeasure1dropdown();
    objCorrelationParam.selectPSF();


  }
}