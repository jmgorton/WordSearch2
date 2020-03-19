# WordSearch

## Overview
A Maven/Java project for finding and returning the locations of words in a classic word search problem. For a complete description of the problem statement, look at this [repo][Problem Statement]. To generate puzzles to use for testing, use a site similar to [this one][Puzzle Generator] (the formatting of the output puzzle file may need to be slightly modified).

## Packaging the App
To package the application into a jar file for execution, run:

`mvn package`

## Running the App
To run the application with no arguments supplied, you can execute one of the following commands:

* `mvn exec:java`
* `java -cp target/<file-name-SNAPSHOT>.jar com.github.jmgorton.wordsearch.App`

To run the application with an file location as an argument, you can run:

`java -cp target/<file-name-SNAPSHOT>.jar com.github.jmgorton.wordsearch.App <relative/path/to/some/puzzle.txt>`

## Running Tests
To run all tests, navigate to the root directory of the project and run:

`mvn test`

To run a single test, or multiple specific tests, run:

`mvn -Dtest=App test`

## Other Commands
For an overview of what maven is, see [Maven's 5 Minute Guide]. 

For a list of other maven lifecycle phases to target, check [this][Lifecycle targets] out.



[Problem Statement]: https://github.com/PillarTechnology/kata-word-search
[Puzzle Generator]: http://puzzlemaker.discoveryeducation.com/WordSearchSetupForm.asp
[Maven's 5 Minute Guide]: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html 
[Lifecycle targets]: https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Lifecycle_Reference

