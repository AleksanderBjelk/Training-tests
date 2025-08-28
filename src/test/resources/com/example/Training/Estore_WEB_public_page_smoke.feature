Feature: Estore WEB Public Pages Smoke

  @TEST_ESTORE_PUBLIC_PAGES @TEST-8000
  Scenario Outline: Customer sees public page Private loan
    Given User navigates to Ikano "<Country>" first page
    Then User should see starting page for Sweden

    Examples:
      | Country |
      | SE      |