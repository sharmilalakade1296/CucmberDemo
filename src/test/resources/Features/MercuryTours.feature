Feature: E2E Flow of Mercury Tour Register

  Scenario Outline: E2E Flow of Mercury Tour Register
    Given user navigate to mercury tour page and user clicks on Register button
    When user enters register information "<FirstName>" "<LastName>" "<Phone>" "<Email>" "<Address>" "<City>" "<State>" "<PostalCode>" "<Country>" "<UserName>" "<Password>" "<ConfirmPassword>"
    Then user click on submit button

    Examples: 
      | FirstName | LastName | Phone      | Email                     | Address | City   | State       | PostalCode | Country | UserName  | Password   | ConfirmPassword |
      | Krishna   | Patil    | 9970910320 | krishnapatil213@gmail.com | Nashik  | Nashik | Maharashtra |      412803 | INDIA   | krishpatil | patilkrish | patilkrish       |
