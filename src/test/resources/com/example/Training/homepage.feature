Feature: Startsida med fler element
  Scenario: Testa element på startsidan
    Given jag öppnar startsidan
    Then ska jag se rubriken "Välkommen till Testträning"
    And ska jag se listobjektet "Lovisa"
    When jag väljer frukten "Banan"
#    And jag markerar intresset "Musik"
    Then ska tabellen innehålla personen "Isak" med ålder "29" och stad "Göteborg"
    When jag klickar på knappen "Gå till nästa sida"
    Then ska jag se rubriken på page2 "Välkommen till sida 2"
    When jag klickar på input1 "Aleksander"
    When jag klickar på input2 "1234"
    When jag klickar på input3 "Joel"
    When jag klickar på input4 "12345"
    When jag klickar på input5 "Lovisa"
    When jag klickar på input6 "12346"
    When jag klickar på input7 "Nikolina"
    When jag klickar på input8 "12347"
    When jag klickar på knappen för att logga in "Logga in"
    When jag klickar knappen för att byta färg "Grön"
    When jag klickar knappen för att byta färg "Röd"
    When jag klickar knappen för att byta färg "Blå"
    When jag klickar knappen för att byta färg "Gul"

