Feature: To validate the Amazon Functionality

  #before
  @sc01 @learnmore
  Scenario: Search Functionality
   # Given user navigates to Amazon Homepage
    When user enters the product name "iphone" in search box
    And user clicks the search icon
    Then user validates the title of search result page
    #before

  @sco2  @learnmore @abc
  Scenario: sign in validation
    Given user navigates to Amazon Homepage
    When user enters the product name "mouse" in search box
    #before

    @MouseAction
    Scenario: Title validation
     # Given user navigates to Amazon Homepage
      When user clicks on baby wishlist
      Then validate the title
    #after

    @staticdropdown
    Scenario: Static dropdown handling
     # Given user navigates to Amazon Homepage
      When user selects the value from the category dropdown
      And user extract the value from the category dropdown
      Then validate the dropdown values
    #after

    #before
    @draganddrop
    Scenario: drag and drop
      # Given user navigates to jquery
      When user preforms drag and drop action
    #after

    @WikiTable
    Scenario: Table handling
      Given user extract the column one values
