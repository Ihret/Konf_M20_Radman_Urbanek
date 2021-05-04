# Class Coffee #

Represents all types of nonalcoholic coffee.

- Extends the abstract Class:
    * Drink
- Implements the Interface:
    * (none)
- Extended by the classes: 
    * (none)

## Instance variables ##

**All instance variables are set to private**

|variable|definition|
|---|---|
|water|The amount of water, needed for the production|
|milk|The amount of milk, needed for the production|
|strength|The strength of the coffee. The stronger it is, the less amount of coffee (represented by volume) is being produced|
|volume|The amount of the finished coffee-product. Depends on the input of water an milk and the strength.|

### Calculation of volume ###

The calculation of volume depends on the amount of water and milk and the given strength.
The water is being poured over the coffee-powder. So the stronger it should be, the less amount of coffee we get as a result.

The water is multiplied with the fraction of 1/strenght. The strenght has a value of 1 to 10.
So the given water is getting from 10% to 100% through the coffee-powder.
If the given strength is lower then 1 it is set to 1 and if over 10 it is set to 10.

The milk is being poured 1:1 into the coffee.

## Alcoholic coffee ##

This class only represents non-alcoholic coffee. If alcoholic needed (e.g. Irish Coffee), a new Class is needed.
This new Class should extend this class and override some variables and methods.

## TO DOs ##
- [x] Write a markdown file for the class
- [] Write a markdown file for the test class
- [] Make a alcoholic coffee class which extends this class