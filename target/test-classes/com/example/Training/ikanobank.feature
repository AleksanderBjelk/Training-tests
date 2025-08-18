Feature: Ikano Bank startsida

  Scenario: Verifiera att startsidan laddas
    Given jag öppnar startsidan på ikano
    Then ska jag se rubriken på Ikano ".hero-heading"
    And ska jag se underrubriken på rubriken ".hero-subheading"
    And jag ska se text om privatlån "//p[strong[contains(text(), 'Information om effektiv ränta för privatlån:')]]"
    When cookies fältet kommer upp ska jag godkänna "button#onetrust-accept-btn-handler"
    When jag trycker på knappen räkna på privatlån "a.rt-ikano-button-accent[href='/lana-pengar/privatlan']"
    And jag inser att jag tryckte fel så jag backar
    Then ska jag se rubriken på Ikano ".hero-heading"
    And ska jag se underrubriken på rubriken ".hero-subheading"
    And jag ska se text om privatlån "//p[strong[contains(text(), 'Information om effektiv ränta för privatlån:')]]"
    When jag trycker på rätt länk "//strong[contains(text(),'Bolån')]"

