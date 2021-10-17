# Progress Report for UofT Secondhand Book MarketPlace

## Specification Summary
Our purpose is to create a secondary hand book platform that connects students who wish to sell their book to potential
buyers.

## CRC Model Summary

Entity classes store data for Users(parent), Seller(child), Buyers(child), and Books.\
Use case classes manage use cases for entities. Register will initialize a user and will manage its 
use cases and update the userData accordingly. Listing will create, update, manage and store the book listings.
CommandExecutor is a controller that will break each command into smaller tasks
UICommand will take text input from the user and call the appropriate functions.

## Scenario Walk-through Summary
A user registers and logs in to his account. He posts a listing for a book he wants to sell. He browses the listings and 
finds a book that he wants to buy. He contacts the seller through the contact information on the listings page. When the 
trade is completed, the seller changes the status of the book to sold.

## Skeleton Program Summary
* Created the skeleton of the User, Buyer, Seller, Book, Register and Login classes.
* Prompted users to enter a username, an email, and a password, when creating a new account.

## Individual Responsibility

* Specification: Tientien

* Crc Model: everyone was involved by splitting into 3 groups of 2. We worked on separate branches then combined them together.

* Scenario Walk-through: Grace

* Construction of skeleton Program:\
Taylan and Will (Book);\
Annie and Grace (User);\
Wesley and Tientien (Platform and User Registration)

* Progress Report: Grace

## Plans for Next Steps
For our next step, we will work on the implementation of all other features of our application. These features include:
posting a listing, storing the listing information to a database, sorting book listings by location, implementing a 
wishlist feature for buyers as well as all other features mentioned in our specification. In addition, we will refine 
our architecture so that it respects Clean Architecture and SOLID principles.

## What has worked well so far?
The way our classes have been interacting have been working well. Our entity classes only interact with each other and 
the managers help with the extra functions that are needed

## Question
What is gradle and do we need to implement it?