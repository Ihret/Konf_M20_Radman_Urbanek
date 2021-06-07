# Gruppe H
- Radman Mario
	* git: marioradman
	* mail: mario.radman@edu.fh-joanneum.at
- Urbanek Theresa
	* git: Ihret
	* mail: theresa.urbanek@edu.fh-joanneum.at
	
# Software Configuration Management #

version 3.0

## Drinks Sample ###

This Example will include a simple project to think about following topics:

- use project structures
- use packages
- use first time git

just try out first technologies and knowledge about the course configuration management. We will cover additional topics in this course with e.g. this first examples and other examples too. 

**Recommendation**: Try to work continuously with this first simple example.


## Requirements

currently tested with

- open project directory with IntelliJ
- with JDK 13


## Given instructions ##

We are given instructions for this project through instruction sheet UEBUNG2.
Additionally, we got the Classes Drink.java, Liquid.java, Main.java and SimpleDrink.java.
After the upload of this standard classes in the src and the standard pom.xml we started implementing all further execution in this readme.


## Classes ##

Current implemented Classes are:

1. Drink.java
2. Liquid.java
3. Main.java
4. SimpleDrink.java
5. Coffee.java
6. Tea.java
7. Selling.java (interface)
8. Seller.java (enum)
9. CashRegister.java

Not including the Classes for testing. These are listed in the Top "JUnit Test Classes".


## First implementation ##
- Configurated a new github-repository.
- Added team members.
- git clone --> connected the local git repo with the github repo
- Added the given files to the local repo.
- git add --> adding file to the staging area (adding all standard files)
- git commit -m --> adding files with message to the commit area
- git push --> adding files from the commit area to the online repo
- git pull --> getting the files from the online repo into the local


## Used manuals and instructions ##
- [UEBUNG02 - Instruction sheet - FH Joanneum Moodle](https://elearning.fh-joanneum.at/pluginfile.php/62610/mod_resource/content/2/Konfig%20Uebung02%20-%20der%20Weg%20zur%20ersten%20Abgabe%2020210311.pdf)
- [Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet)
- [Informations about Subclasses - FH Joanneum Moodle](https://elearning.fh-joanneum.at/pluginfile.php/62121/mod_resource/content/1/01_Vorlesung1_2.pdf)
- [How to write a git commit message](https://chris.beams.io/posts/git-commit/#seven-rules)
- [UEBUNG04 - Instruction sheet - FH Joanneum Moodle](https://elearning.fh-joanneum.at/pluginfile.php/63595/mod_resource/content/0/Konfig%20Uebung04%20-Zweite%20Abgabe%2020210415.pdf)
- [How to write JavaDoc Comments](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)


## Changes ##
- First implementation of the Drinks project.
- Adding new Class "Coffee" - Subclass from Drink (Mario)
- Adding in main: output of coffee; updating Class "Coffee" with toString method and rounding of volume
- Adding new Class "Tea" - Subclass from Drink (Theresa)
- Adding in main: output of tea
- 25.04.2021:
	* Adding new JUnit-Test-Class: TeaTest.java
	* Adding new JUnit-Test-Class: CoffeeTest.java
	* Changes in Liquid: 
		- Override Method for equals: Checks if the instanceveraibles of two different instances of Liquid are the same value. If true, it returns true.
		- setVolume: Implement the checkVolume function in this function. Otherwise, there could be inconsistence or mistakes.
	* Changes in Coffee: Correction of wrong volume calculation in line 33. Adding new getters for strength, water and milk.
	* Changes in Drink: Adding new getter for name.
- 04.06.2021:
	* Adding new Interface Selling.java
	* Implementing Interface Selling Override-methods in Tea.java, Coffee.java, SimpleDrinks.java
- 05.06.2021:
	* Adding new Class CashRegister.java
		constructor, setter and getter
		additional methods
		- soldDrinks
		- reportNoneAlcoholicDrinks
		- reportLowAlcoholicDrinks
		- reportHighAlcoholicDrinks
		- reportSpecificDay
		- reportSpecificSeller
		- reportSpecificDaySeller
		- randomNumber
	* Adding new Enum Seller.java
	* Updating main with report methods
- 07.06.2021:
  * Updating CashRegister
  * Adding new JUNIT-Test-Class: CashRegisterTest.java
  * Updating markdowns: Coffee.md, TeaTest.md, ProjectStructure.md
  * Adding new markdowns: CashRegister.md, CashRegisterTest.md, CoffeeTest.md, Tea.md
  * Adding new JUNIT-Test-Classes: SimpleDrinkTest, TeaTest, LiquidTest
  * Configurated the site.xml


## Procedure ##
before each change following steps where excecuted:
- git pull
- git add
- git commit -m "reason for change"
- git push

and afterwards the README.md was updated and seperated commitet

### branches ###
- git branch (shows branches)
- git branch branchName (creates new branch)
- git checkout branchName (changes to new branch)
- git branch -d branchName (delets branch locally)
- git merge branchName (attention: working directory MUST BE MAIN!!!)

#### remote branches ####
- git push -u origin branchName (uploads local branch)
- git branch -r (to see all remote branches)
- git branch -a (to see all remote and lokal branches)
- git checkout -b branchName (checkout to remote branch)
- git push origin --delete branchName (delets remote branch)

#### branch merge ####
- git checkout main
- git merge branchName
- git commit -m "Message"
- git push

#### branch reset ####
When there are problems with the merging of files, a reset of a branch to the current main version can be useful.
For this, the current branch should not be the main. Then this git-command is used:
- git reset --hard origin/main

### testing ###
- Inside IntelliJ:
	* add new src/test/java directory
	* create new Test
		- Testing library: JUnit5
		- Class name: "ClassIntendendToBeTested"Test
		- Destination package: at.fhj.iit (same Package as the tested Class)
	* Check needed Imports. For the Drinks projects in the first implementation, there have been used:
		- import org.junit.jupiter.api.BeforeEach;
		- import org.junit.jupiter.api.DisplayName;
		- import org.junit.jupiter.api.Test;
		- import org.junit.jupiter.params.ParameterizedTest;
		- import org.junit.jupiter.params.provider.CsvSource;
		- import static org.junit.jupiter.api.Assertions.*;
	* Standard Setup Phase implementation:
		- Class variable: public TestedObject object;
		- Implement @BeforeEach
		- Implement Tests:
			* ParameterizedTests: Test with CSV-Source for the same test with different parameters
			* Test: Simple Test
			* assertEquals: Inspection method for the test - parameters are the current and the expected values, if necessary a tolerance. Test is positiv if values for expected and current are the same.
			* assertNotEquals: Same as assertEquals, but the Test is positive if the values are not the same.


## Branches (current) ##
- teatest
	* From Theresa Urbanek
	* Init. Push 24.04.2021
	* Classes included:
		- TeaTest.java
	* Implements the Classes for testing the Class Tea.
- CoffeeTest
	* From Mario Radman
	* Init. Push 24.04.2021
	* Classes included:
		- CoffeeTest.java
	* Implements the Classes for testing the Class Coffee.
- cashRegister
	* From Mario Radman/Theresa Urbanek
	* Init. Push 17.05.2021
	* Classes included:
		- Seller.java
		- Selling.java
		- CashRegister.java
	* Test-Classes included:
		- CashRegisterTest.java
		- SimpleDinkTest.java
		- LiquidTest.java

	
### Changes to branches ###
- 15.04.2021: TU: added new branch for testing - named "theresatest"
- 15.04.2021: MR: added new branch for testing - named "marioBranchTest"
- 15.04.2021: TU: deleted branches "theresatest" nad "marioBranchTest"
- 24.04.2021: TU: added new branch for testing class Tea - named "teatest"
- 24.04.2021: TU: merged the teatest branch to the main branch.
- 25.04.2021: MR: added new branch for testing class Coffee - named "CoffeeTest"
- 25.04.2021: MR: merged the CoffeeTest branch to the main branch.
- 17.05.2021: MR/TU: added new branch cashRegister for implementing new features: interface, enum and contructor CashRegister
- 07.06.2021: MR: merged cashRegister with main branch

## JUnit Test Classes ##
- CashRegisterTest.java
- CoffeeTest.java
- LiquidTest.java
- SimpleDrinkTest.java
- TeaTest.java

[For full informations, see the automatic Maven Testclass Report](testapidocs/at/fhj/iit/package-summary.html)
	
### Test coverage ###
The test coverage can be checked in IntelliJ by using the option "Run Test with Coverage". 
It presents then the percentage of the coverage for the whole package and each class seperate, also seperated by methods and lines.
In our application, the test coverage had following results:

#### FULL TEST COVERAGE ####
- for all classes 100%
- for all methods in all classes 100%
- for all lines in all classes 100%

#### TeaTest ####
|classname|class|method|line|
|---|---|---|---|
|Tea|100%|100% (12/12)|100% (24/24)|
|Drink|100%|50% (1/2)|75% (3/4)|
|Liquid|100%|55% (5/9)|58% (14/24)|

#### CoffeeTest ####

|classname|class|method|line|
|---|---|---|---|
|Tea|100%|100% (11/11)|100% (26/26)|
|Drink|100%|100% (2/2)|100% (4/4)|
|Liquid|100%|55% (5/9)|62% (15/24)|
	
#### CashRegisterTest ####
|classname|class|method|line|
|---|---|---|---|
|CashRegister|100%|100% (15/15)|100% (50/50)|
|Coffee|100%|45% (5/11)|50% (13/26)|
|Drink|100%|50% (1/2)|75% (3/4)|
|Liquid|100%|55% (5/9)|58% (14/24)|
|Seller|100%|100% (2/2)|100% (4/4)|
|Tea|100%|91% (11/12)|95% (23/24)|	
  
#### LiquidTest ####
|classname|class|method|line|
|---|---|---|---|
|LiquidTest|100%|100% (9/9)|95% (23/24)|

#### SimpleDrinkTest ####
|classname|class|method|line|
|---|---|---|---|
|SimpleDrink|100%|100% (7/7)|95% (11/11)|
|LiquidTest|100%|44% (4/9)|41% (10/24)|
|Drink|100%|50% (1/2)|75% (3/4)|

- General comment:
	"Real" 100% is never fully possible, because sometimes developers are forgetting or overlooking something.
	The Test
	Sometimes the test works only for one method, but another simple one is not supported.
	Similar for variables: For example, in the Liquid Constructor, it is not allowed to have a negative Volume as parameter. The setVolume function does not have this method included. So, a negative Volume is possible by using the setter. 
	If a test for negative Volume is only been checked by the constructor, the possible negative volume through the setter will not be found.
	Also new implemented methods could change the variables or functions and make mistakes in previously made tests.

## .gitignore ##
- 24.04.2021: .gitignore file created
- 24.04.2021: added not used file types for java git development
- 24.04.2021: added .idea
- 07.06.2021: added target