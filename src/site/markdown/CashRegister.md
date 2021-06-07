# Class CashRegister #

- @author Theresa Urbanek
- @date 07/06/2021

Represents a further function of the drinks - reports.

- Extends the abstract Class:
    * (none)
- Implements the Interface:
    * (none)
- Extended by the classes:
    * (none)
    
- used Interfaces:
    * Selling
- used Enum class:
    * Seller

## Instance variables ##

**All instance variables are set to private**

|variable|definition|
|---|---|
|cashRegisterList|A list of cashs - registered drinks|
|cash| Object CashRegister, which can be a coffee or tea|
|drink|uses the Interface|
|amountOfDrinks|The amount of sold drinks|
|date|The date of the sold drink|
|seller|Seller of the drinks, via Enums.|
|tea|A kind of drink.|
|coffee|A kind of drink.|

## Methods ##
- sellDrink: sells any kind of drink
- equals: compares if an object is an instance of CashRegister
  
### methods used for reports ###
- reportNoneAlcoholicDrinks: Calculates the sales volume of all non-alcoholic drinks#
- reportLowAlcoholicDrinks: Calculates the sales volume of all low alcoholic drinks (lower or equal 16%)
- reportHighAlcoholicDrinks: Calculates the sales volume of all high Alcoholic Drinks (higher than 16%)
- reportSpecificDay: Calculates the sales volume of all Drinks on a specific day
- reportSpecificSeller: Calculates the sales volume of all Drinks sold by a specific seller
- reportSpecificDaySeller: Calculates the sales volume of all Drinks sold by a specific seller on a specific day

## TO DOs ##
- [x] Write a markdown file for the class
- [X] Write a markdown file for the test class