Feature: Ikano Bank startsida

  Scenario: Verifiera att startsidan laddas
    Given jag öppnar startsidan på ikano
    Then ska jag se rubriken på Ikano ".hero-heading"
    And ska jag se underrubriken på rubriken ".hero-subheading"
    And jag ska se text om privatlån "//p[strong[contains(text(), 'Information om effektiv ränta för privatlån:')]]"
    When cookies fältet kommer upp ska jag godkänna "button#onetrust-accept-btn-handler"
    And jag trycker på knappen räkna på privatlån "a.rt-ikano-button-accent[href='/lana-pengar/privatlan']"
    And jag inser att jag tryckte fel så jag backar
    Then ska jag se rubriken på Ikano ".hero-heading"
    And ska jag se underrubriken på rubriken ".hero-subheading"
    And jag ska se text om privatlån "//p[strong[contains(text(), 'Information om effektiv ränta för privatlån:')]]"
    When jag trycker på rätt länk "//strong[contains(text(),'Bolån')]"
    Then ska jag se rubriken på Ikano ".hero-heading"
    And jag ser rubriken om Ikea lån "//h2[contains(text(), 'Bättre bolån som IKEA Family medlem')]"
    And jag ska se en lista med frågor ".ikano-accordion"
    And jag ska se näst fråga i listan "/html/body/section[2]/section[12]/div[1]/article[1]/ul/li[5]/span"
    When jag klickar på frågan ska jag det dyka upp mer text "/html/body/section[2]/section[12]/div[1]/article[1]/ul/li[5]/span"
    Then ska jag se den nya texten "/html/body/section[2]/section[12]/div[1]/article[1]/ul/li[5]/article"
    And jag ska hitta länken till nästa sida "a.rt-ikano-link[href='/bolan/ikea-family']"
    When jag klickar på länken läs mer om bolån ska jag komma till en ny sida "a.rt-ikano-link[href='/bolan/ikea-family']"
    Then ska jag se rubriken på Ikano ".hero-heading"
    When jag klickar på länken ska jag förflyttas ner på sidan "a.rt-ikano-button-accent[href='/#raknare']"
    And jag klickar på knappen köpa ny bostad ("(//span[contains(@class,'monthly-cost-jmih20') and contains(@class,'e1a08yaa1')])[2]"))
    And jag klickar på fältet för att sätta ett ogiltigt värde "#housing-value"
    And jag klickar på fältet för insats "#down-payment"
    Then borde jag se att husets värde är satt till lägsta värde "#housing-value"
    When jag klickar på fältet för att sätta in en felaktig insats "#down-payment"
    And jag klickar på knappen köpa ny bostad ("(//span[contains(@class,'monthly-cost-jmih20') and contains(@class,'e1a08yaa1')])[2]"))
    Then borde jag se att insatsen har nått sitt lägsta värde "#down-payment"


