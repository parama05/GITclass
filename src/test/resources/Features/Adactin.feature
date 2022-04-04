Feature: Validation of booking hotel in Adactin web application

  Background: 
    Given User launch Adactin web Application
    Then User verify Login Page is displayed

  Scenario Outline: TC02_Validation of booking order in different Location with different Hotels
    When User enters valid "<userName>" and valid "<passWord>"
    And User clicks Login Button
    Then User verify search hotel page is displayed
    When User select"<Location>" "<Hotel>", "<Room Type>", "<Number of Rooms>", "<Check In date>", "<Check Out date>", "<Adults per Room>", "<Children per Room>"
    And User clicks submit Button
    Then User verify Select Hotel page is displayed
    When User clicks radio Button and clicks continue Button
    Then User verify Book A Hotel page is displayed
    When User enters valid "<First Name>", "<Last Name>", "<Billing Address>", "<Credit Card No>", "<Card Type>", "<Exp Month>", "<Exp Year>", "<CVV Number>"
    And User clicks Book Now Button
    Then User verify Booking confirmation page is displayed and order id is displayed

    Examples: 
      | userName   | passWord | Location  | Hotel          | Room Type    | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No   | Card Type        | Exp Month | Exp Year | CVV Number |
      | parama0505 | Pg@54321 | Melbourne | Hotel Creek    | Standard     | 1 - One         | 30/03/2022    | 31/03/2022     | 1 - One         | 1 - One           | Paramaguru | P         | Thanjavur       | 9876543212345678 | VISA             | December  |     2022 |        986 |
      | parama0505 | Pg@54321 | Brisbane  | Hotel Sunshine | Deluxe       | 2 - Two         | 02/04/2022    | 03/04/2022     | 2 - Two         | 2 - Two           | Nishanth   | S         | Vallam          | 9876543212345698 | American Express | December  |     2022 |        674 |
      | parama0505 | Pg@54321 | London    | Hotel Hervey   | Double       | 4 - Four        | 05/04/2022    | 06/04/2022     | 3 - Three       | 3 - Three         | Vincent    | J         | Thanjavur       | 9876543212345647 | Master Card      | December  |     2022 |        052 |
      | parama0505 | Pg@54321 | New York  | Hotel Cornice  | Super Deluxe | 3 - Three       | 08/04/2022    | 09/04/2022     | 4 - Four        | 4 - Four          | Rajkumar   | S         | Pudukottai      | 9876543212345475 | VISA             | December  |     2022 |        645 |

      
  Scenario: TC01_Validation of booking order in Adactin Hotel webpage with valid details
    When User enters valid userName and valid passWord
    And User clicks Login Button
    Then User verify search hotel page is displayed
    When User select Location select Hotel, Room Type, Number of Rooms, CheckIn date, Checkout date, Adults per Room, Children per Room
    And User clicks submit Button
    Then User verify Select Hotel page is displayed
    When User clicks radio Button and clicks continue Button
    Then User verify Book A Hotel page is displayed
    When User enters valid First Name, Last Name, Billing Address, Credit Card No, Card Type, Expiry date, CVV Number
    And User clicks Book Now Button
    Then User verify Booking confirmation page is displayed and order id is displayed
      