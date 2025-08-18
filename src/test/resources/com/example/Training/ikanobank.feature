Feature: Ikano Bank startsida

  Scenario: Verifiera att startsidan laddas
    Given jag öppnar startsidan på ikano
    Then ska jag se rubriken på Ikano "/html/body/section[2]/section[1]/div/div/h1"

