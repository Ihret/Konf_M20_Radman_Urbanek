# Design and Functionality #

- @author Theresa Urbanek
- @author Mario Radman
- @date 07/06/2021

## step-by-step ##
1) discussion in group who does who with an input how
2) implementation of the interface Selling, extension of tea and coffee
3) implementation of the enum Seller
4) implementation of the constructor CashRegister
    + method for adding a sale
    + methods for varies reports
   
## Considerations for Design ##
Main Problem is, to get the information from the Drinks, add them to further infos (Seller, Date, etc.) and save them centralized.
Not important was the actual usage in the main via console.
All Drinks must implement the Selling-Interface. This interface provides the Drinks with methods which they have to implement.
Because of this same methods from this interface, it is easily possible to work with them like one object-type, although they were different classes.
Especially the price-calculation had to be very different for every Drink, because also in real life, calculations always are made individual.

## Cash Register ##
On central it has a ArrayList which stores all sellings. To store them, the sellings are CashRegister-Objects, which require some information:
- which drink is it (constructed with all neccessary construction-information)
- who sold it
- how much did he sold in this selling

Through this, all sellings are centralized and unified in one ArrayList as one Object per Selling. Therefore, further implementations, features and improvements can be integrated easily.
    