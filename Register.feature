Feature: Register

Scenario: User registers an account with all fields
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Naved"
And User enters last name "Khan"
And User enters email "naved@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User select yes newsletter option
And User select privacy policy option
And User clicks on continue button
Then User should get logged in successfuly
And User should navigate on account success page
When User clicks on continue button from account success page
Then User should navigate on my account page

Scenario: User registers an account with mandatory fields
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Shoeb"
And User enters last name "Khan"
And User enters email "shoeb@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User clicks on continue button 
Then User should get logged in successfuly
And User should navigate on account success page

Scenario: User registers an account with valid data
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Faiz"
And User enters last name "Khan"
And User enters email "faiz@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921" 

Scenario: User registers an account with invalid email
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Naved"
And User enters last name "Khan"
And User enters email "123445.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User select yes newsletter option
And User select privacy policy option
And User clicks on continue button
Then User should not get logged in successfuly
And User should get warning massage for email field "E-Mail Address does not appear to be valid!"

Scenario: User registers an account with existing email
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Ubaid"
And User enters last name "Khan"
And User enters email "naved@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User select yes newsletter option
And User select privacy policy option
And User clicks on continue button
Then User should not get logged in successfuly
And User should get warning massage for email field "Warning: E-Mail Address is already registered!"

Scenario: User registers an account without fields
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User clicks on continue button
Then User should get warning massages for first name "First Name must be between 1 and 32 characters!"
And for last name "Last Name must be between 1 and 32 characters!"
And for email "E-mail Address does not appear to be valid!"
And for phone "Telephone must be between 3 and 32 characters!"
And for password "Password must be between 4 and 20 characters!"
And for pravacy policy field "Warning: You must agree to the Privacy Policy"

Scenario: User registers an account with invalid phone number
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Naved"
And User enters last name "Khan"
And User enters email "naved@gmail.com"
And User enters password "9921"
And User enters confirm password "9921"
And User select yes newsletter option
And User select privacy policy option
And User enters phone "avbd"
And User clicks on continue button
Then User should not get logged in successfuly
And User should get warning massage for phone field "Telephone must be between 3 and 32 characters!"

Scenario: User registers an account without privacy policy option
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Salik"
And User enters last name "Khan"
And User enters email "salik@gmail.com"
And User enters phone "9921992199"
And User select yes newsletter option
And User enters password "9921"
And User enters confirm password "9921"
And User Unselect privacy policy option
And User clicks on continue button 
And User should not get logged in successfuly

Scenario: User registers an account with different password and confirm password field
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Shoeb"
And User enters last name "Khan"
And User enters email "shoeb@gmail.com"
And User enters phone "9921992199"
And User select yes newsletter option
And User enters password "9921"
And User enters confirm password "1234"
And User clicks on continue button 
And User should not get logged in successfuly
And User should get warning massage for password confirm field "Password confirmation does not match password!"

Scenario: User registers an account using keyboard keys
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Samir"
And User enters last name "Khan"
And User enters email "samir@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User select yes newsletter option
And User select privacy policy option
And User clicks on continue button
Then User should get logged in successfuly
And User should navigate on account success page

Scenario: User registers an account with Yes newsletter option
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Said"
And User enters last name "Khan"
And User enters email "said@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User select yes newsletter option
And User clicks on continue button 
Then User should get logged in successfuly
And User should navigate on account success page
When User clicks on continue button from account success page
Then User should navigate on my account page
When User clicks on subscribe/unsubscribe to newsletter option
Then User should display yes option selected by default

Scenario: User registers an account with No newsletter option
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Rais"
And User enters last name "Khan"
And User enters email "rais@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User select no newsletter option
And User clicks on continue button 
Then User should get logged in successfuly
And User should navigate on account success page
When User clicks on continue button from account success page
Then User should navigate on my account page
When User clicks on subscribe/unsubscribe to newsletter option
Then User should display no option selected by default

Scenario: User registers an account and data stores in the database
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name "Salman"
And User enters last name "Khan"
And User enters email "salman@gmail.com"
And User enters phone "9921992199"
And User enters password "9921"
And User enters confirm password "9921"
And User select yes newsletter option
And User select privacy policy option
And User clicks on continue button
Then User should get logged in successfuly
And User should display all entered registered data in database

Scenario: User registers an account only with spaces
Given User opens the application "https://tutorialsninja.com/demo/"
When User clicks on my account dropdown menu
And User clicks on register option
And User enters first name " "
And User enters last name " "
And User enters email " "
And User enters phone " "
And User enters password " "
And User enters confirm password " "
And User select yes newsletter option
And User select privacy policy option
And User clicks on continue button
Then User should get warning massages for first name "First Name must be between 1 and 32 characters!"
And for last name "Last Name must be between 1 and 32 characters!"
And for email "E-mail Address does not appear to be valid!"
And for phone "Telephone must be between 3 and 32 characters!"
And for password "Password must be between 4 and 20 characters!"
And for pravacy policy field "Warning: You must agree to the Privacy Policy"
