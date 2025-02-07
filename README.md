# BDD-with-JUnit5-and-Cucumber
Inspired by [Catalin Tudose's course in BDD](https://learning.oreilly.com/videos/bdd-with-junit/10000MNLV202121/10000MNLV202121-Tudose_1/)

# Package junit5
This shows the implementation with TDD without making use of the features in JUnit5 towards BDD.

# Package junit5_bdd_first_step
This shows the implementation of BDD using JUnit5.

Annotations & assertions used:
- `@DisplayName("<Given/When/Then ...")`: Given/When/Then to be displayed in test window
- `@Nested`: to define 'Given' and 'When' sections as *Java nested classes*
- `@Test`: to define 'Then' section as *Java method*
- `assertAll("<Note>", <Executable_lambda>)`: concise way of assertion. Benefit: all assertions will be executed despite any failures. 

# Package bdd_cucumber
Steps:
1) Create Cucumber .feature file
2) Run .feature file  
![img.png](img.png)
3) Error will tell you what to put in your .java file with @Given, @When, @Then annotations - Create java code for this.  
![img_2.png](img_2.png)
4) Modify the methods as necessary

***For some reason, this part is not working.. I might need to redo this part altogether.*** 
