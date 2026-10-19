<!-- Junit 5
1) what is test? why junit? 
2) what is Maven? 
3) assertions and annotations? 
4) test life cycle? 
5)Junit 5 architecture?


A unit test is a small piece of code that calls your code and checks the answer if that's what you expected
Analogy: you bake a cake recipe, before selling, you test a piece , is it sweet? Is it baked enough? 
A unit test is that check done by the computer in milliseconds every time you change the recipe
With test you press one button and check whether everything still works
Junit 5 is a library which give you the tools to write and run those checks

Every test follows the same three steps
1)arrange
2)act
3)assert

Arrange
Set things up
Act
Do that thing
Assert
Check the answer

// Arrange: set things up
Calculator calc = new Calculator();
// Act: do the thing
int result = calc.add(2, 3);
// Assert: check the answer
assertEquals(5, result); 

What is Maven?
Naveen is a project management and build tool 
It does three jobs for you 
1) downloads libraries like junit so that you don't hunt for .jar files
2) it compiles code for you 
3) runs your test with one command


Imagine you are a chef (you write the recipe=Java code) 
Maven is your kitchen Manager 
You handover shopping list (POM.xml)<project object model>
The manager byes it sets of the kitchen cooks and tests then says it failed the test

junit-demo/
├── pom.xml                   ← the shopping list / settings
└── src/
├── main/java/            ← your real code (Calculator.java)
└── test/java/            ← your tests (CalculatorTest.java)


mvn -v
Version check
mvn compile
Compiles src or main files
mvn test
Compiles and runs all the tests present in the folder/directory 
mvn clean test
Deletes the old target folder first then test

mvn test : runs all the taste files inside the current folder

Analogy:
The j unit platform is the building , projector system and the ticket counter, and it can show you any movie. Jupiter is today's modern movie the only one you can write. Vintage is an old film or movie that runs on the same projector, the building doesn't care what movie plays as long as the matching engine (player) exists.
-->