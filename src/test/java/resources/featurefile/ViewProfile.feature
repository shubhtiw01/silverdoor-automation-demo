Feature: View Profile functionality
  Scenario: As a user I should be able to view Hanish Vithal's personal profile
    Given I am on the SilverDoor Homepage verified by the text "Business. Accommodated."
    When I click on View all profiles under the Meet the team section
    Then I should be directed to the staff profiles page verified by the text "Staff Profiles"
    And I click on the dropdown list related to departments and select SilverDoor Executive Team
    And I click on Hanish Vithal's profile
    Then I should see the correct profile displayed verified by the text "Hanish Vithal"