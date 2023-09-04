package com.silverdoorapartments.pages;

import com.silverdoorapartments.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HanishVithalPage extends Utility {
    private static final Logger log = LogManager.getLogger(HanishVithalPage.class.getName());

    public HanishVithalPage() {
        PageFactory.initElements(driver, this);}
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Hanish Vithal')]")
    WebElement verifyHanishVithal;

    public String verifyHanishVithalText(){
        log.info("Verifying navigation to Hanish Vithal profile : " + verifyHanishVithal.toString());
        return getTextFromElement(verifyHanishVithal);
    }
}
