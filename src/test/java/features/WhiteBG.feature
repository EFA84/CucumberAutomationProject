Feature: Confirm background is White

@smoke2
Scenario: User should be able to click set white background button and background turns white
Given user is on the "https://techfios.com/test/101/index.php" page
When user Clicks White background button
Then the background should turn White