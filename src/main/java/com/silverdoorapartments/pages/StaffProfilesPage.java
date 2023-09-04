package com.silverdoorapartments.pages;

import com.silverdoorapartments.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffProfilesPage extends Utility {
    private static final Logger log = LogManager.getLogger(StaffProfilesPage.class.getName());

    public StaffProfilesPage() {
        PageFactory.initElements(driver, this);}
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Staff Profiles')]")
    WebElement staffProfiles;

    public String verifyStaffProfileText(){
        log.info("Verifying navigation to staff profiles tab : " + staffProfiles.toString());
        return getTextFromElement(staffProfiles);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@class='uk-select uk-form-width-medium uk-text-primary']")
    WebElement dropDown;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'SilverDoor Executive Team')]")
    WebElement silverDoorExecutiveTeam;

    public void clickOnDropDown(){
        log.info("Clicking Dropdown : " + dropDown.toString());
        clickOnElement(dropDown);
    }

    public void selectSilverDoorExecutiveTeam(){
        log.info("Selecting SilverDoor Executive Team : " + silverDoorExecutiveTeam.toString());
        clickOnElement(silverDoorExecutiveTeam);
    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Hanish Vithal')]")
    WebElement hanishVithal;

    public void clickOnHanishVithal(){
        log.info("Clicking on Hanish Vithal : " + hanishVithal.toString());
        clickOnElement(hanishVithal);
    }
}
