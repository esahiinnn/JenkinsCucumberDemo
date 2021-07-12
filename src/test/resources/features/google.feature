@googleTest
Feature: Google Title Test
  Scenario: Test
    Given User goes to google home page
    And User gets the title of the page
    Then User validates the title
  @googleTest2
    Scenario: Test2
      Given User goes to google home page
      And User gets the url of the page
      Then User validates the url
