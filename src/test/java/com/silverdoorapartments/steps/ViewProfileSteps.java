package com.silverdoorapartments.steps;

import com.silverdoorapartments.pages.HanishVithalPage;
import com.silverdoorapartments.pages.HomePage;
import com.silverdoorapartments.pages.StaffProfilesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ViewProfileSteps {
    @When("^I click on View all profiles under the Meet the team section$")
    public void iClickOnViewAllProfilesUnderTheMeetTheTeamSection() throws InterruptedException {
        new HomePage().clickOnViewAllProfiles();
        Thread.sleep(2000);
    }

    @Then("^I should be directed to the staff profiles page verified by the text \"([^\"]*)\"$")
    public void iShouldBeDirectedToTheStaffProfilesPageVerifiedByTheText(String staffProfilePageText) {
        Assert.assertEquals("Staff Profiles page not displayed",staffProfilePageText,new StaffProfilesPage().verifyStaffProfileText());
    }

    @And("^I click on the dropdown list related to departments and select SilverDoor Executive Team$")
    public void iClickOnTheDropdownListRelatedToDepartmentsAndSelectSilverDoorExecutiveTeam() {
        new StaffProfilesPage().clickOnDropDown();
        new StaffProfilesPage().selectSilverDoorExecutiveTeam();
    }

    @And("^I click on Hanish Vithal's profile$")
    public void iClickOnHanishVithalSProfile() {
        new StaffProfilesPage().clickOnHanishVithal();
    }

    @Then("^I should see the correct profile displayed verified by the text \"([^\"]*)\"$")
    public void iShouldSeeTheCorrectProfileDisplayedVerifiedByTheText(String hanishVithalText) {
        Assert.assertEquals("Hanish Vithal profile not displayed",hanishVithalText,new HanishVithalPage().verifyHanishVithalText());
    }
}