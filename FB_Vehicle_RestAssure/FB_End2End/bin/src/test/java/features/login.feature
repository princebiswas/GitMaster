Feature: Login Functionality

  @Assert
  Scenario: Login with Incorrect Username and correct Password
    Given User login with facebook website
    Then Enter incorrect Email id
    Then Enter correct Password
    Then click on Sigin Button
    And Validate the Error
    Then Clear the text field
   # Then  browser should close
@incorrectpassword @All
  Scenario: Login with correct Username and incorrect Password
    //Given User login with facebook website
    Then Enter Correct Email id
    Then Enter Incorrect Password
    Then click on Sigin Button
    And Validate the Error
    Then Clear the text field
   # Then  browser should close

  @correctUsername @All
  Scenario: Login with correct username and password
  // Given User login with facebook website
    Then Enter correct email and Password
    Then click on Sigin Button

    ##Then  browser should close



