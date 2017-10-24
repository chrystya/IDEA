package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssessmentsSelectionPage {

    WebDriver driver;

    By reading3d = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:Reading 3D DIBELS Next\"]");
    By dnext = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:DIBELS Next\"]");
    By reading3dSpanish = By.cssSelector(".assmt-family-element[bo-auto-assmt-product=\"mCLASS:Reading 3D Spanish\"]");
    By idel =



    method selectR3D(By link) {
        driver.findElement(link).click();
    }

}
