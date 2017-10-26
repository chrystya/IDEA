package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ParametersSectionCorrelation {

    WebDriver driver;

    By assessment1Dropdown = By.cssSelector("#rpt-dropdown-73");
    By measure1Dropdown = By.cssSelector("div[data-auto-parameter=\"measures\"] .btn-group");
    By measure1DropdownBtn = measure1Dropdown.cssSelector("button");
    By PSF = measure1Dropdown.cssSelector("ul li a[title=\"PSF\"]");

    By schoolYear1Dropdown = By.cssSelector("#rpt-dropdown-79");
    By period1Dropdown = By.cssSelector("#rpt-dropdown-82");

    By assessment2Dropdown = By.cssSelector("#rpt-dropdown-86");
    By measure2Dropdown = By.cssSelector("rpt-dropdown-89");
    By schoolYear2Dropdown = By.cssSelector("rpt-dropdown-92");
    By period2Dropdown = By.cssSelector("rpt-dropdown-95");



    public ParametersSectionCorrelation(WebDriver driver) {
        this.driver = driver;

    }
    public void openMeasure1dropdown() {
        driver.findElement(measure1DropdownBtn).click();
    }


   Select measure1dr = new Select(driver.findElement(measure1DropdownBtn));
    measure1dr.


    public void selectPSF() {
        driver.findElement(PSF).click();
    }

    }

