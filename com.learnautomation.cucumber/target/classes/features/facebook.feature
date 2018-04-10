Feature: Smoke Test facebooklogin

  Scenario: able to log in to facebook
    Given open the facebook in chrome
    And Enter the valid "Santhoshilakshmi95@gmail.com" and "Edwardbella" and click on log in
    Then I havee to log in to facebook
