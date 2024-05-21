Feature: shopping
@tag
Scenario: By product
Given open application
When search product
And select product
And Add to cart
Then buy