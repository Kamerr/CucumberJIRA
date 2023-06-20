@wip
Feature: US 19: Success Shopping Test 01

	Background:


	#test case of tests where a product is added to the cart and other steps are passed and the purchase is successful

	Scenario: US 19: Success Shopping Test 01
		Feature:Success Shopping
			Scenario:
			Given The user is on the login page
			When The user should be able to login with valid "kamer@gmail.com" and "12345_Ka"
			Then The user should be able to see logout button
			When The user clicks on your story to go to the homepage
			Then The user click product
			Given The user click buyNow button
			Then The user should be able to see Checkout text
			Then The user should be able to click I want to use an existing address
			And The user should be able to click Billing Continue button
			Then The user should be able to click  delivery I want to use an existing address
			And The user should be able to click Delivery Continue Button
			And The user should be able to enter Delivery Method Add Comments About Your Order
			And The user should be able to click Delivery Method Continue
			Then The user should be able to click Cash On Delivery
			And The user should be able to enter Payment Method Add Comments About Your Order
			And The user should be able to click I have read and agree to the Terms & Conditions
			And The user should be able to click Continue
			And The user should be able to see Total
			And The user should be able to click Confirm Order button
			And The user should be able to see  Your order has been placed!
			And The user should be able to Success Page Continue Button
