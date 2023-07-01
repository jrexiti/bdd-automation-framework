Feature: WebDriver University - Contact Us Page


    Scenario: Successful Test Submission

        Given user navigates to university contact us Page
        When user enters a unique first name
        And user enters a unique last name
        And user enters a unique email
        And user clicks on the submit button
        Then user should be presented with a successful contact us submission message