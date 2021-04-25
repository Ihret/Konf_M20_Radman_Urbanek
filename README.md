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
	
### Changes to branches ###
- 15.04.2021: TU: added new branch for testing - named "theresatest"
- 15.04.2021: MR: added new branch for testing - named "marioBranchTest"
- 15.04.2021: TU: deleted branches "theresatest" nad "marioBranchTest"
- 24.04.2021: TU: added new branch for testing class Tea - named "teatest"
- 24.04.2021: TU: merged the teatest branch to the main branch.
- 25.04.2021: MR: added new branch for testing class Coffee - named "CoffeeTest"
- 25.04.2021: MR: merged the CoffeeTest branch to the main branch.

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


# Javadoc - Summary of important information #

### API Specification ###

- Implement all assertions which are needed, to implement the Java application.
- Unless otherwise noted, the Java API Specification assertions need to be implementation-independent. Exceptions must be set apart and prominently marked as such.

### Programming Guide Documentation ###

- Needed for understanding of the code.
- Can include:
	* Examples
	* Definition of programming terms
	* Concenptual overviews
	* Metaphors
	* Description of implementation bugs and workarounds
	* Custom tags
- Information for Implementation-Independence and Automatic re-use of method comments can be found here:
	* [See oracle](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#implementationindependence)

### Bugs and Workaround ###

- Bugs and workarounds should be documentated in details.
- Bug-Types
	* API-Spec-Bugs
	Present at the method declaration or in the doc comment that affect the syntax or semantics. 
	Example: Method that throws a NullPointerException by a "null" parameter, but a "null" parameter is actually useful and should be accepted.
	* Code-Bugs
	Bugs in the implementation rather than API specification. Distributed seperately in the bug report. 

### Terminology ###

- API dpecifications / API documentation (API specs / API docs)
	* On-line or hardcopy description of API
	* [Example of API specs](https://docs.oracle.com/javase/7/docs/api/)
- Documentation comments (doc comments)
	* Special comments, processed by Javadoc tool to generate API docs
	* Delimited by: `/** ... */`

### Source Files ###

- Java classes Sourcecode (.java) contain comments for: 
	* class
	* interface
	* field
	* constructor
	* method
- Package comment files contain package comments
- Overview comment files contain comments about the set of packages
- Miscellaneous unprocessed files  include images, sample source code, class files, applets, HTML files, and whatever else you might want to reference from the previous files.

## Formatting ###

- Doc comment is written in HTML.
- Two parts:
	* Description
	* Block tags
- First line needs the begin comment for javadoc `/**`
- First sentence should be a short summary of the method. Java/Javadoc/your IDE places this sentence prominent on different places.
- Link-Inline-Tag: {@link URL}
- Separate paragraphs by using `<p>` as only code in a new line.
- Separate the description and block tags by a blank line.
- After or in between block tags there cannot be any description.
- Maximum for doc-comment-line is 80 character.
- [Example and further infos on oracle website](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#format)
- [Further examples](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#examples)

## Style Guide ##

- Use `<code> ... </code>` for keywords and names, including:
	* Java keywords
	* package names
	* class names
	* method names
	* interface names
	* field names
	* argument names
	* code examples
- Use not too much HTML links
- Miss out the content of method brackets, if you mean one form of the method (`add(int, Object`). Miss also the brackets, if you mean all forms of the method (`add`).
- Distinguish methods and fields als such, to distinguish them.
- Be clear when using the term "field". It has two meanings:
	* static field, which is another term for "class variable"
	* text field, alternative names could be "date field, "number field", etc.
- It is ok to use phrases instead of correct sentences.
- 3rd person instead of 2nd person perspective.
- Method description begin with verb ("Gets the label..." instead of "This method gets...")
- Class/Interface/Field descriptions can omit the subject ("A button label" instead of "This field is a button label")
- Use "this" instead of "the" when referring to an object
- Add description beyond the API name

## Default Constructors ##

- Default constructor which is not implemented intentionally, cannot be given a documentation.
- It is recommended to implement the default constructor (if needed) explicitly.
- Example for documentation of explicit implemented default constructors:
> /**
> Sole constructor. (For invocation by subclass 
> constructors, typically implicit.)
> */

## Tag Conventions ##

### Tag Infos ###
- Required Tags are:
	* @param for every parameter
	* @return for every not-void method
	* Both are required every time, even when the description is obvious
- @author
	* Can be provided once, multiple or none
	* If author is unknown use "unascribed"
- @version
	* Java convention for this tag is "%I%, %G%", which is being converted when the file is checked by SCCS
- @param
	* Followed by the parameter name
	* Then followed by description of parameter
	* By convention, first noun of description is the data type
		- For int the data type is usually omitted
	* Dashes or other punctuation should not be inserted before description
	* Do not bracket the parameter name after @param tag with "<code>...</code>"
	* Start with a phrase and follow it with a sentence, if needed.
	* When writing a phrase, do not capitalize and do not end with a period:
		- @param x  the x-coordinate, measured in pixels
	* When writing a phrase followed by a sentence, do not capitalize the phrase, but end it with a period to distinguish it from the start of the next sentence:
		- @param x  the x-coordinate. Measured in pixels.
	* If you prefer starting with a sentence, capitalize it and end it with a period:
		- @param x  Specifies the x-coordinate, measured in pixels.
	* When writing multiple sentences, follow normal sentence rules:
		- @param x  Specifies the x-coordinate. Measured in pixels.
- @throws
	* Is the same as @exception
	* Should be included for any checked exception and also any unchecked exception that the caller might want to catch.
	* It is considered poor programming practice to include unchecked exceptions in the throws clause.
	* Not needed for NullPointerException

### Important Tags ###
Description of the Tags in the table.
If used more then one tag, include them in the given order.

| tag | parameter | description |
|---|---|---|
| *@author* | name | describes the author|
| *@version* | version | version entry |
| *@param* | name description | parameter description of method |
| *@return* | description | return value of method |
| *@exception* | classname description | describes the exception from the method|
| *@throws* | classname description | describes the exception from the method|
| *@see* | reference | link to a different part of the doku |

### Ordering Multiple Tags ###
- Multiple @author tags should be listed in chronological order, with the creator of the class listed at the top.
- Multiple @param tags should be listed in argument-declaration order. This makes it easier to visually match the list to the declaration.
- Multiple @throws tags (also known as @exception) should be listed alphabetically by the exception names.  
- Multiple @see tags should be ordered as shown in the following link:
	* [Ordering Multiple Tags](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html#orderingmultipletags)
