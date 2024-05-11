Feature: Learnmore

  #before
  @learnmore @abc @loginlearnmore
  Scenario: error message validation
   # Given user navigate to learnmore page
    #beforestep
    When user enter the username "learnmore" and password "123"
    #afterstep
    And user clicks the login button
    #afterstep
    Then validate the error message
  #afterstep

    #after
