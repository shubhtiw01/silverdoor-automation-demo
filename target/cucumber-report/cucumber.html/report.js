$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrbiLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Orbi Login functionality",
  "description": "",
  "id": "orbi-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3735751900,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "As a user, I should not be able to login to the Orbi platform, using invalid credentials.",
  "description": "",
  "id": "orbi-login-functionality;as-a-user,-i-should-not-be-able-to-login-to-the-orbi-platform,-using-invalid-credentials.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on the SilverDoor Homepage verified by the text \"Business. Accommodated.\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on the Orbi symbol",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "A new tab opens with the Orbi login page displayed, verified by the Sign In button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I enter \"test@mail.com\" into the Email field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \"test123\" into the Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click the Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the error message \"Wrong credentials\" displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Business. Accommodated.",
      "offset": 54
    }
  ],
  "location": "OrbiLoginSteps.iAmOnTheSilverDoorHomepageVerifiedByTheText(String)"
});
formatter.result({
  "duration": 94036900,
  "status": "passed"
});
formatter.match({
  "location": "OrbiLoginSteps.iClickOnTheOrbiSymbol()"
});
formatter.result({
  "duration": 5065905400,
  "status": "passed"
});
formatter.match({
  "location": "OrbiLoginSteps.aNewTabOpensWithTheOrbiLoginPageDisplayedVerifiedByTheSignInButton()"
});
formatter.result({
  "duration": 75185500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@mail.com",
      "offset": 9
    }
  ],
  "location": "OrbiLoginSteps.iEnterIntoTheEmailField(String)"
});
formatter.result({
  "duration": 46813600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 9
    }
  ],
  "location": "OrbiLoginSteps.iEnterIntoThePasswordField(String)"
});
formatter.result({
  "duration": 33139100,
  "status": "passed"
});
formatter.match({
  "location": "OrbiLoginSteps.iClickTheSignInButton()"
});
formatter.result({
  "duration": 210519100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wrong credentials",
      "offset": 32
    }
  ],
  "location": "OrbiLoginSteps.iShouldSeeTheErrorMessageDisplayed(String)"
});
formatter.result({
  "duration": 57785500,
  "status": "passed"
});
formatter.after({
  "duration": 618994200,
  "status": "passed"
});
formatter.uri("ViewProfile.feature");
formatter.feature({
  "line": 1,
  "name": "View Profile functionality",
  "description": "",
  "id": "view-profile-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2142074100,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "As a user I should be able to view Hanish Vithal\u0027s personal profile",
  "description": "",
  "id": "view-profile-functionality;as-a-user-i-should-be-able-to-view-hanish-vithal\u0027s-personal-profile",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on the SilverDoor Homepage verified by the text \"Business. Accommodated.\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on View all profiles under the Meet the team section",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should be directed to the staff profiles page verified by the text \"Staff Profiles\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I click on the dropdown list related to departments and select SilverDoor Executive Team",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Hanish Vithal\u0027s profile",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see the correct profile displayed verified by the text \"Hanish Vithal\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Business. Accommodated.",
      "offset": 54
    }
  ],
  "location": "OrbiLoginSteps.iAmOnTheSilverDoorHomepageVerifiedByTheText(String)"
});
formatter.result({
  "duration": 24373700,
  "status": "passed"
});
formatter.match({
  "location": "ViewProfileSteps.iClickOnViewAllProfilesUnderTheMeetTheTeamSection()"
});
formatter.result({
  "duration": 2909180500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Staff Profiles",
      "offset": 70
    }
  ],
  "location": "ViewProfileSteps.iShouldBeDirectedToTheStaffProfilesPageVerifiedByTheText(String)"
});
formatter.result({
  "duration": 17561100,
  "status": "passed"
});
formatter.match({
  "location": "ViewProfileSteps.iClickOnTheDropdownListRelatedToDepartmentsAndSelectSilverDoorExecutiveTeam()"
});
formatter.result({
  "duration": 108672400,
  "status": "passed"
});
formatter.match({
  "location": "ViewProfileSteps.iClickOnHanishVithalSProfile()"
});
formatter.result({
  "duration": 366730800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hanish Vithal",
      "offset": 65
    }
  ],
  "location": "ViewProfileSteps.iShouldSeeTheCorrectProfileDisplayedVerifiedByTheText(String)"
});
formatter.result({
  "duration": 26141000,
  "status": "passed"
});
formatter.after({
  "duration": 628796000,
  "status": "passed"
});
});