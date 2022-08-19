@wip
Feature: Login functionality
  Description: This is login functionality test

  Background:
    When User enter login module

  Scenario: Login as a driver
    And User enter driver credentials and click login button
    Then User should be on dashboard page

  Scenario: Login as a salesManager
    And User enter salesManager credentials and click login button
    Then User should be on dashboard page

  Scenario: Login as a storeManager
    And User enter storeManager credentials and click login button
    Then User should be on dashboard page

  Scenario Outline: Wrong credentials input
    And user enters wrong "<username>" and "<password>"

    Then user should see error message
    Examples:
      | username               | password                  |
      | driver_username        | fake_negScenario_password |
      | sales_manager_username | fake_negScenario_password |
      | store_manager_username | fake_negScenario_password |
  @NegWip
  Scenario: Wrong email in forget password module
    And User click forget passsword button
    And User enter wrong "<username>"
    Then User should see wrong username error message



