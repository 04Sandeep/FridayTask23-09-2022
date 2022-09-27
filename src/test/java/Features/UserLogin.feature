Feature: Applying for leave

  Scenario: User applying for leave and then logout
    Given navigate to Orange HRM website
    When user is on Login Page and enter the Valid Credentials and verify
    Then user will apply for leave
    And user will log out

