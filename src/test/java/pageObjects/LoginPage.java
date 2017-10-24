package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By userName = By.id("login-username");

    By password = By.id("password");

    By loginBtn = By.id("login-submit");



    public LoginPage(WebDriver driver){

        this.driver = driver;

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        driver.findElement(userName).sendKeys(strUserName);

    }



    //Set password in password textbox

    public void setPassword(String strPassword){

        driver.findElement(password).sendKeys(strPassword);

    }



    //Click on login button

    public void clickLogin(){

        driver.findElement(loginBtn).click();

    }


    public void loginToCI(String strUserName,String strPassword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPassword);

        //Click Login button

        this.clickLogin();



    }

}