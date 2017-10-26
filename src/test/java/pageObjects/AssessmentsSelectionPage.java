package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssessmentsSelectionPage {

    WebDriver driver;

    By reading3d = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:Reading 3D DIBELS Next\"]");
    By dnext = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:DIBELS Next\"]");
    By reading3dSpanish = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:Reading 3D Spanish\"]");
    By idel = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:IDEL\"]");
    By math = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:Math\"]");


    public AssessmentsSelectionPage(WebDriver driver) {
        this.driver = driver;

    }

    public void selectR3D() {
        driver.findElement(reading3d).click();
    }

    public void selectDNext() {
        driver.findElement(dnext).click();
    }

    public void selectR3DSpanish() {
        driver.findElement(reading3dSpanish).click();
    }

    public void selectIDEL() {
        driver.findElement(idel).click();
    }

    public void selectMath() {
        driver.findElement(math).click();
    }




}
