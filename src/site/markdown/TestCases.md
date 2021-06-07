# Test coverage #
The test coverage can be checked in IntelliJ by using the option "Run Test with Coverage".
It presents then the percentage of the coverage for the whole package and each class seperate, also seperated by methods and lines.
In our application, the test coverage had following results:

## full test coverage ##
- for all classes 100% 
- for all methods in all classes 100%
- for all lines in all classes 100%


## TeaTest ##
|classname|class|method|line|
  |---|---|---|---|
|Tea|100%|100% (12/12)|100% (24/24)|
|Drink|100%|50% (1/2)|75% (3/4)|
|Liquid|100%|55% (5/9)|58% (14/24)|

## CoffeeTest ##

|classname|class|method|line|
  |---|---|---|---|
|Tea|100%|100% (11/11)|100% (26/26)|
|Drink|100%|100% (2/2)|100% (4/4)|
|Liquid|100%|55% (5/9)|62% (15/24)|

## CashRegisterTest ##
|classname|class|method|line|
  |---|---|---|---|
|CashRegister|100%|100% (15/15)|100% (50/50)|
|Coffee|100%|45% (5/11)|50% (13/26)|
|Drink|100%|50% (1/2)|75% (3/4)|
|Liquid|100%|55% (5/9)|58% (14/24)|
|Seller|100%|100% (2/2)|100% (4/4)|
|Tea|100%|91% (11/12)|95% (23/24)|	

## LiquidTest ##
|classname|class|method|line|
  |---|---|---|---|
|LiquidTest|100%|100% (9/9)|95% (23/24)|

## SimpleDrinkTest ##
|classname|class|method|line|
  |---|---|---|---|
|SimpleDrink|100%|100% (7/7)|95% (11/11)|
|LiquidTest|100%|44% (4/9)|41% (10/24)|
|Drink|100%|50% (1/2)|75% (3/4)|


## General comment
  "Real" 100% is never fully possible, because sometimes developers are forgetting or overlooking something.
  Sometimes the test works only for one method, but another simple one is not supported.
  Similar for variables: For example, in the Liquid Constructor, it is not allowed to have a negative Volume as parameter. The setVolume function does not have this method included. So, a negative Volume is possible by using the setter.
  If a test for negative Volume is only been checked by the constructor, the possible negative volume through the setter will not be found.
  Also new implemented methods could change the variables or functions and make mistakes in previously made tests.
