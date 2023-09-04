package com.silverdoorapartments.pages;

import com.silverdoorapartments.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class OrbiPage extends Utility {
    private static final Logger log = LogManager.getLogger(OrbiPage.class.getName());

    public OrbiPage() {
        PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;

    public void verifyNavigationToOrbiPage(){
        Set<String> windowHandles = driver.getWindowHandles();

// Iterate through the handles to find the correct tab
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        log.info("Verifying presence of sign in button : " + signInButton.toString());
        verifyThatElementIsDisplayed(signInButton);
    }

    public void clickSignInButton(){
        clickOnElement(signInButton);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    public void enterEmail(String email){
        log.info("Entering Email : " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    public void enterPassword(String password) {
        log.info("Entering Password : " + passwordField.toString());
        sendTextToElement(passwordField,password);
    }

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Wrong credentials')]")
    WebElement errorMessage;
     public String verifyErrorMessage(){
         log.info("Verifying Error Message : " + errorMessage.toString());
         return getTextFromElement(errorMessage);
     }


}
