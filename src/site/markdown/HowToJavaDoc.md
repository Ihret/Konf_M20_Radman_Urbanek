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

## git tag - versions ##
- git tag -a v"number" -m "commit message"
- git tag v"number"-lw (lightweight tag, -a, -s, -m not used)
- git show v"number"
- git checkout v"number"
