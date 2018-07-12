@tag1
Feature: Login Action
@tag2
Scenario: Successful Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogInPage
 And User enters UserName and Password
 Then Message displayed Login Successfully
@tag3
Scenario: Successful LogOut
  When User LogOut from the Application
  Then Message displayed LogOut Successfully
