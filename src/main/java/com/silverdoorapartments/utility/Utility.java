package com.silverdoorapartments.utility;

import com.silverdoorapartments.drivermanager.ManageDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Utility extends ManageDriver {
    /**
     * Utility Class extends to ManageDriver for the driver to finding locators.
     * All common methods are fixed in the utility Class.
     * This method will generate random number.
     */
    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);

    }

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }

    /**
     * This method will return list of web elements
     */
    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will clear previous stored data
     */
    public void clearTextFromField(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }

    public void sendTabAndEnterKey(By by) {
        driver.findElement(by).sendKeys(Keys.TAB);
        //driver.findElement(by).sendKeys(Keys.ENTER);
    }

    //********************************************** Alert Methods **************************************************//

    /**
     * This method will switch to alert
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    /**
     * This method will accept alert
     */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    /**
     * This method will dismiss alert
     */
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    /**
     * This method will get text from alert
     */
    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    /**
     * This method will send text from alert
     */
    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    //******************************************* Select Class Methods **********************************************//

    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void selectByVisibleTextFromDropDown(WebElement element, String text) {
        new Select(element).selectByVisibleText(text);
    }

    /**
     * This method will select the option by value
     */
    public void selectByValueFromDropDown(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        new Select(element).selectByValue(value);
    }

    /**
     * This method will select the option by index
     */
    public void selectByIndexFromDropDown(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }

    public void selectByIndexFromDropDown(WebElement element, int index) {
        new Select(element).selectByIndex(index);
    }

    /**
     * This method will select the option by contains text
     */
    public void selectByContainsTextFromDropDown(By by, String text) {
        List<WebElement> allOptions = new Select(driver.findElement(by)).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }

    //***************************************** Window Handle Methods ***********************************************//

    /**
     * This method will close all windows
     */
    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }

    /**
     * This method will switch to parent window
     */
    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    /**
     * This method will find that we switch to right window
     */
    public boolean switchToRightWindow(String windowTitle, List<String> handleList) {
        for (String str : handleList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window....");
                return true;
            }
        }
        return false;
    }

//    public String switchBetweenWindowHandle(String windowTitle, WebElement element) {
//        Set<String> handles = driver.getWindowHandles();
//        List<String> handleList = new ArrayList<String>(handles);
//        switchToRightWindow(windowTitle, handleList);
//        return getTextFromElement(element);
//    }

    //Switching Between Windows Methods
    public void retrieveWindowHandles() {
        Set<String> handles = driver.getWindowHandles();
        for (Object windowNames : handles) {
            System.out.println(windowNames);
        }
    }

    public static void switchToOtherWindow(WebDriver driver) {
        String currentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    //Switching Between Windows Methods

//    public void retrieveWindowHandles() {
//        Set handles = getAllWindowHandles();
//        for (Object windowNames : handles) {
//            System.out.println(windowNames);
//            log.info("I can see the external windows that open " + windowNames.toString());
//        }
//    }
//
//    public void switchBetweenWindowHandle(){
//
//        // Open the first window and do something
//        driver.get("https://www.example.com/");
//        String firstWindowHandle = driver.getWindowHandle();
//
//        // Open the second window and do something
//        driver.get("https://www.example.org/");
//        switchToOtherWindow(driver);
//        String secondWindowHandle = driver.getWindowHandle();
//
//        // Switch back to the first window and do something
//        driver.switchTo().window(firstWindowHandle);
//
//        // Assert that the driver is now back in the first window
//        Assert.assertEquals(firstWindowHandle, driver.getWindowHandle());
//
//        driver.quit();
//    }


    //***************************************** iFrame Handling Methods *********************************************//

    public void switchToiFrameWithName(String name) {
        driver.switchTo().frame(name);
    }

    public void switchToiFrameWithWebElement(WebElement element) {
        driver.switchTo().frame(element);
    }

    public static boolean isElementPresentInIframe(By locator) {
        try {
            WebElement iframe = driver.findElement(By.className("iframe"));
            driver.switchTo().frame(iframe);
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        } finally {
            driver.switchTo().defaultContent();
        }
    }

    //********************************************** Action Methods *************************************************//

    /**
     * This method will use to hover mouse on element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * This method will use to hover mouse on element and click
     */
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

//    public void dragAndDropToTheLeft(WebElement element1, WebElement element2){
//        Actions action = new Actions(driver);
//        action.dragAndDrop = builder.clickAndHold(element1).moveToElement(element2).release(element2).build();
//    }



    //********************************************** Waits Methods **************************************************//

    /**
     * This method will use to wait until  VisibilityOfElementLocated
     */
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }

    //******************************************** Is Display Methods ***********************************************//

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    //******************************************** ScreenShot Methods ***********************************************//

    /**
     * This method will take screenshot
     */
    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/silverdoorapartments/screenshots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/silverdoorapartments/screenshots/" + screenshotName + dateName +".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /**
     * Screenshot methods
     */
    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
    }

