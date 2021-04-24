# Gruppe H
- Radman Mario
- Urbanek Theresa


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
- [UEBUNG2 - Insctruction sheet - FH Joanneum Moodle] (https://elearning.fh-joanneum.at/pluginfile.php/62610/mod_resource/content/2/Konfig%20Uebung02%20-%20der%20Weg%20zur%20ersten%20Abgabe%2020210311.pdf)
- [Markdown Cheat Sheet] (https://www.markdownguide.org/cheat-sheet)
- [Informations about Subclasses - FH Joanneum Moodle] (https://elearning.fh-joanneum.at/pluginfile.php/62121/mod_resource/content/1/01_Vorlesung1_2.pdf)

## Changes ##
- Adding new Class "Coffee" - Subclass from Drink (Mario)
- Adding in main: output of coffee; updating Class "Coffee" with toString method and rounding of volume
- Adding new Class "Tea" - Subclass from Drink (Theresa)
- Adding in main: output of tea

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

## Branches for testing ##
- 15.04.2021: TU: added new branch for testing - named "theresatest"
- 15.04.2021: MR: added new branch for testing - named "marioBranchTest"
- 15.04.2021: TU: deleted branches "theresatest" nad "marioBranchTest"
- 24.04.2021: TU: added new branch for testing class Tea - named "teatest"

### classes ###
- TeaTest
	* testVolume: tests the volume of the tea
	* testAlcoholic: tests if the tea is alcoholic
	* testAlcoholAmount: tests how much alcoholic volem the tea has

## .gitignore ##
- 24.04.2021: .gitignore file created
- 24.04.2021: added java endings



# JavaDoc #
| tag | parameter | description |
| *@author* | name | describes the author
| *@version* | version | version entry |
| *@see* | reference | link to a different part of the doku |
| *@param* | name description | parameter description of method |
| *@return* | description | return value of method |
| *@exception* | classname description | describes the exception from the method
| *@throws* | classname description | describes the exception from the method

