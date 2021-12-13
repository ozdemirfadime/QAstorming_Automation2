@QaStorming
Feature: QaStorming Feature

  Background:
    * Navigate to https://training.qastorming.com/
    * Check to go to homepage or not


  Scenario: Add product and clear cart page
    * Click the SHOP NOW button on the banner
    * Check to go to Products page
    * Click the Add to Cart button for the first product on the product page
    * Wait for 3
    * Click the shopping cart icon in the navigation bar
    * Wait for 5
    * Check this product has been added to shopping cart or not
    * Wait for 2
    * Update Product quantity as 3
    * Wait for 2
    * Click the Update Cart button on the Cart page
    * Wait for 2
    * Check total cart amount is that correctly increased
    * Wait for 3
    * Remove this products in shopping cart then check warning message as Your cart is currently empty
    * Wait for 2

  Scenario: Scrolling in page
    * Scroll down the page
    * Wait for 3
    * Check scrolled bottom of page
    * Scroll up the page then check there is top of page or not
    * Wait for 3

  Scenario:
    * Click menu item called SHOP
    * Wait for 2
    * Check to go to Products page
    * Wait for 1
    * Sort product as Sort by latest
    * Wait for 1
    * Click the Add to Cart button for the first 3 product on the product page
    * Wait for 3
    * Click any View Cart button for has been added first 3 product on the product page
    * Wait for 1
    * Check this product has been added to shopping cart or not














