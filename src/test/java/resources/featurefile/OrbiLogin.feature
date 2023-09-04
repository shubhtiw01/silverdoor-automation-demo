Feature: Orbi Login functionality
  Scenario: As a user, I should not be able to login to the Orbi platform, using invalid credentials.
    Given I am on the SilverDoor Homepage verified by the text "Business. Accommodated."
    When I click on the Orbi symbol
    Then A new tab opens with the Orbi login page displayed, verified by the Sign In button
    And I enter "test@mail.com" into the Email field
    And I enter "test123" into the Password field
    And I click the Sign In button
    Then I should see the error message "Wrong credentials" displayed


