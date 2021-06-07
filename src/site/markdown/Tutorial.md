# Tutorial #

- @author Theresa Urbanek
- @author Mario Radman
- @date 07/06/2021

## Overview ##

multiple classes with different jobs

|classes|job/description|
|---|---|
|Main|Start of the program|
|Drinks|constructor|
|SimpleDrinks|extends Drinks and implements interface Selling|
|Coffee|extends Drink and implements interface Selling|
|Tea|extends Drink and implements interface Selling|
|Selling|Interface, with a few methods, used in CashRegister|
|Seller|Enum, that sellers are written correctly|
|CashRegister|constructor, generates Drinks - teas and coffees, methods for reports|
|testclasses|tests all kinds of options of the code|

for more detailed information, please look up the different single markdowns of the classes.
Here we will provide only basic information for usage.

## Implementation of new Drinks ##
New Drinks can be implemented easily. They must have following adjustments:
- Subclass von Drink (extends Drink)
- Interface of Selling (implements Selling)

It is useful to use the "super()" constructor in the Constructor of the new Drink.
It is necessary to implement the methods from the Selling interface.
Please consider to lookup in classes like Tea or Coffee, to see how it was done before.

### Liquid ###
Consider not using lone member-variables for the ingredients, but more members of type Liquid.

### Drink and Selling ###
If new Methods or Members are needed for the Drinks in general, consider them to implement or announce them in the abstract Class Drink or in the Selling Interface.
If it's needed for further improvements for Selling, do it in the Selling interface, otherwise in den Drink-Class.

## Seller ##
If new Seller are needed, add them to the enum Seller.

## Cash Register ##
Here you can have a CashRegister to save all sellings. If you plan to improve this, consider necessary changes in the constructor. 
With further improvements and new information, new reports will be needed. Don't forget to implement them.

## Main Method ##
Because it wasn't our assignment, we didn't implement scanner and user interface. This is the next step to do.
Consider using the main for this, maybe use an IOHandler.



