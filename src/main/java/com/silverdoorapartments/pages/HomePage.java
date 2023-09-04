package com.silverdoorapartments.pages;

import com.silverdoorapartments.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//h2[@class='uk-light uk-margin-remove-top sda-hero-heading uk-visible@s']")
    WebElement homePageText;

    public String verifyHomePageText() {
        log.info("Getting text from : " + homePageText.toString());
        return getTextFromElement(homePageText);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/nav[1]/div[3]/div[1]/div[2]/a[1]/img[1]")
    WebElement orbiButton;

    public void clickOnOrbiButton(){
        log.info("Clicking on Orbi button : " + orbiButton.toString());
        clickOnElement(orbiButton);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'View all profiles')]")
    WebElement viewAllProfiles;

    public void clickOnViewAllProfiles(){
        log.info("Clicking on View All Profiles button : " + viewAllProfiles.toString());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewAllProfiles);
        clickOnElement(viewAllProfiles);
    }

}
