# Gruppe H
- Radman Mario
	* git: marioradman
	* mail: mario.radman@edu.fh-joanneum.at
- Urbanek Theresa
	* git: Ihret
	* mail: theresa.urbanek@edu.fh-joanneum.at


# Software Configuration Management #

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

We are given instructions for this project through insctruction sheet UEBUNG2.
Additionalle we got the Classes Drink.java, Liquid.java, Main.java and SimpleDrink.java.
After the upload of this standard classes in the src and the standard pom.xml we startet implementing all further excecutions in this readme.


## Classes ##

Current implemented Classes are:

1. Drink.java
2. Liquid.java
3. Main.java
4. SimpleDrink.java
5. Coffee.java
6. Tea.java

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
- [UEBUNG02 - Instruction sheet - FH Joanneum Moodle] (https://elearning.fh-joanneum.at/pluginfile.php/62610/mod_resource/content/2/Konfig%20Uebung02%20-%20der%20Weg%20zur%20ersten%20Abgabe%2020210311.pdf)
- [Markdown Cheat Sheet] (https://www.markdownguide.org/cheat-sheet)
- [Informations about Subclasses - FH Joanneum Moodle] (https://elearning.fh-joanneum.at/pluginfile.php/62121/mod_resource/content/1/01_Vorlesung1_2.pdf)
- [How to write a git commit message] (https://chris.beams.io/posts/git-commit/#seven-rules)
- [UEBUNG04 - Instruction sheet - FH Joanneum Moodle] (https://elearning.fh-joanneum.at/pluginfile.php/63595/mod_resource/content/0/Konfig%20Uebung04%20-Zweite%20Abgabe%2020210415.pdf)
- [How to write JavaDoc Comments] (https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)


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
- git push -u origin branchName (uploads local branch)
- git branch -d branchName (delets newBranch locally)
- git push origin --delete branchName (delets newBranch online)
- git merge branchName (attention: working directory MUST BE MAIN!!!)

#### branch merge ####
- git checkout main
- git merge branchName
- git commit -m "Message"
- git push

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
			* ParameterizedTests: Mit CSV Quelle für denselben Test mit unterschiedlichen Parametern
			* Test: Für einen einfachen Test
			* assertEquals: Überprüfungsmethode des Tests - parameter sind der aktuelle und der erwartete Wert, ggf. Toleranz. Test ist positiv ausgefallen wenn idente Werte.
			* assertNotEquals: Wie assertEquals. Test ist aber positiv ausgegangen, wenn nicht idente Werte.

## Branches for testing ##
- 15.04.2021: TU: added new branch for testing - named "theresatest"
- 15.04.2021: MR: added new branch for testing - named "marioBranchTest"
- 15.04.2021: TU: deleted branches "theresatest" nad "marioBranchTest"
- 24.04.2021: TU: added new branch for testing class Tea - named "teatest"
- 24.04.2021: TU: merged the teatest branch to the main branch.
- 25.04.2021: MR: added new branch for testing class Coffee - named "CoffeeTest"
- 25.04.2021: MR: merged the CoffeeTest branch to the main branch.

###
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
	

## JUnit Test Classes ##
- TeaTest
	* testVolume: tests the volume of the tea
	* testAlcoholic: tests if the tea is alcoholic
	* testAlcoholAmount: tests how much alcoholic volem the tea has
- CoffeeTest
	* volumeStrengthTest: tests the volume depending on the strength of the coffee. Also testing strength over- and underflow.
	* strengthTest: tests the correct handling of strength esp. over- and underflow.
	* coffeeNameTest: tests the correct input and output of coffee name.
	* alcoholPercentageTest: tests if the alcohol percentage is always 0 (zero).
	* alcoholTest: tests if the isAlcohol returns always false.
	* waterTest: tests if the Liquid variable of Water and all of it's instancevariables are correctly saved.
	* milkTest: tests if the Liquid variable of Milk and all of it's instancevariables are correctly saved.
	* liquidEqualsTrueTest: tests if the new override method for equals in Liquid is correctly working for two different instances with the same values. Should return true.
	* liquidEqualsFalseTest: same test as "liquidEqualsTrueTest", but for two instances with different values. Should return false.

### Test coverage ###
- TeaTest:
	
- CoffeeTest:
	It was tried to have a 100% test coverage. All variables of the class, superclass and also variables of implemented Objects inside the class are being tested.
	Also new methods in other classes, who has been needed for the tests, are being tested (equals in Liquid).

- General comment:
	100% is never fully possible, because sometimes developers are forgetting or overlooking something.
	Sometimes the test works only for one method, but another simple one is not supported.
	Similar for variables. E.g. in the Liquid Constructor, it is not allowed to have a negative Volume as parameter. The setVolume function does not have this method included. So, a negative Volume is possible by using the setter. 
	If a test for negative Volume is only been checked by the constructor, the possible negative volume through the setter will not be found.
	Also new implemented methods could change the variables or functions and make mistakes in previously made tests.

## .gitignore ##
- 24.04.2021: .gitignore file created
- 24.04.2021: added not used file types for java git development
- 24.04.2021: added .idea



# JavaDoc #

## Overview ##
| tag | parameter | description |
|---|---|---|
| *@author* | name | describes the author|
| *@version* | version | version entry |
| *@see* | reference | link to a different part of the doku |
| *@param* | name description | parameter description of method |
| *@return* | description | return value of method |
| *@exception* | classname description | describes the exception from the method|
| *@throws* | classname description | describes the exception from the method|