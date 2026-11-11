Feature: As a bank customer to open an account
  So that I can use the bank account in the website

  Background: User navigate to Register page
    Given User is in Home Page --> Register Page

    Scenario: User Registration
      Given User enter full name as "Cherry"
      And user enter Email Address as "herry667@gmail.com"
      And user enter Mobile Number as "1596365923"
      And user enter Password as "cherHil4"
      And user enter Confirm Password as "cherHil4"
      When user click on open my account
      Then profile name will display "Cherry"
