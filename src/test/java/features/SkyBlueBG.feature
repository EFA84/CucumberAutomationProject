Feature: Confirm background is SkyBlue

@smoke
Scenario: User should be able to click set skyblue background button and background turns skyblue
Given user is on "https://techfios.com/test/102/index.php" page
When user Clicks Skyblue background button
Then the background should turn Skyblue
