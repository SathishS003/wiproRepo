Feature: Rediff login using data table

  Background: 
    Given I navigate to "https://www.rediff.com/" Page

  @rediff
  Scenario: 
    Then I click on signIn
    And Click on create a new account
    Then Fill all the details in the page
