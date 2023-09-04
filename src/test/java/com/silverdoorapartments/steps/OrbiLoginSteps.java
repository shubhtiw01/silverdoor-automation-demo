package com.silverdoorapartments.steps;

import com.silverdoorapartments.pages.HomePage;
import com.silverdoorapartments.pages.OrbiPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OrbiLoginSteps {
    @Given("^I am on the SilverDoor Homepage verified by the text \"([^\"]*)\"$")
    public void iAmOnTheSilverDoorHomepageVerifiedByTheText(String homePageText)  {
        Assert.assertEquals("Homepage not displayed", homePageText, new HomePage().verifyHomePageText());
    }

    @When("^I click on the Orbi symbol$")
    public void iClickOnTheOrbiSymbol() throws InterruptedException {
        new HomePage().clickOnOrbiButton();
        Thread.sleep(5000);
    }

    @Then("^A new tab opens with the Orbi login page displayed, verified by the Sign In button$")
    public void aNewTabOpensWithTheOrbiLoginPageDisplayedVerifiedByTheSignInButton() {
        new OrbiPage().verifyNavigationToOrbiPage();
    }

    @And("^I enter \"([^\"]*)\" into the Email field$")
    public void iEnterIntoTheEmailField(String email){
        new OrbiPage().enterEmail(email);
    }

    @And("^I enter \"([^\"]*)\" into the Password field$")
    public void iEnterIntoThePasswordField(String password) {
        new OrbiPage().enterPassword(password);
    }

    @And("^I click the Sign In button$")
    public void iClickTheSignInButton() {
        new OrbiPage().clickSignInButton();
    }

    @Then("^I should see the error message \"([^\"]*)\" displayed$")
    public void iShouldSeeTheErrorMessageDisplayed(String errorMessageText) {
        Assert.assertEquals("Error message not displayed", errorMessageText, new OrbiPage().verifyErrorMessage());
    }

}
