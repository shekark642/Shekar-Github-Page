{% include navigation.html %}


## Tech talk 1

There are many algorithms for different purposes and they interact with different data structures. algorithms as dynamic underlying pieces that interact with data structures.  Well managed data structures and algorithms ensures well-optimized and efficient code.

Programming Paradigms:
Data Structures and Algorithms can be written using different paradigms. A paradigm is an approach or a methodology or a strategy for writing software applications.

Imperative Paradigm
In computer science, imperative programming is a programming paradigm that uses statements that change a program's state. An imperative program consists of commands for the computer to perform to achieve a result. 

Procedural programming is a type of imperative programming in which the program is built from one or more procedures 


Object Oriented Paradigm
Object Oriented programming (OOP) is a programming paradigm that relies on the concept of classes and objects. It is used to structure a software program into simple, reusable pieces of code blueprints (usually called classes), which are used to create individual instances of objects.

- Defining Classes with a Constructor and Instance variables
- Protecting information through Encapsulation (setters, getters)
- Extending Classes to maximize code reuse
- Creating subclass-specific behavior through polymorphism

## FRQ Terms

**Casting, specifically for Division**
If you set an integer variable equal to the division of  two integers with a remainder, the integer value of the answer will only remain
Should be cast as a double
Code:
```
 int x =5;
int y =4;
int z=x/y;(int z is equal to 1)
int z=(double) x/y; (int z is equal to 1.25)

```

**Casting, specifically for Truncating or Rounding**
Casting a double variable as an integer removes the decimal values from the current value, and leaves an integer
(NOTE): This is not the same as rounding, as the double value simply is condensed to its integer value

Code:
```
for example double x=5.75;
rounding to the nearest integer would mean x=6;
int y = (int) x;
casting to an integer means that x=5

```

**Wrapper Classes, why wrap int, double**
Class for data types so you can use methods on them (eg. Integer, Double)
- has methods
- treat it like an object
 
**Concatenation, rules on mixed type Concatenation**
Putting strings together
Can add ints into strings 
used in strings
Code
```
int choice = 1;
String selection = “You have selected choice “ + choice;
System.out.println(selection); → “You have selected choice 1”
```

**Math class, specifically Random usage**
Can import math class and use very useful functions
Can import random to generate random numbers 
```
Import java.util.Random
Random rand = new Random()
```

**Compound Boolean Expression**
Logic operators ||, &&, output should be true or false
```
int x = 5
x > 3 || x > 7 → true 
x > 3 && x > 7 → false
```

**Truth Tables**
Or vs and truth tables
You are basically creating a column/table and giving a possible combination for each piece in the table. You are essentially testing out the combinations for each combinations
!https://www.google.com/url?sa=i&url=http%3A%2F%2Fbcs.whfreeman.com%2Fwebpub%2Fmathematics%2Fgersting7e%2Fchapter%25201%2Fsection1-1%2FTruth_Tables.htm&psig=AOvVaw2Mkp-oJ1oKyhM4a_bKiN0Z&ust=1643124019520000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMj5zZT2yvUCFQAAAAAdAAAAABAD(Truth Table)!

**De Morgan's Law**
If not (a and b) → We know that it is either not a OR not b
If not (a or b) → We know that is either not a AND b

**Comparing Numbers**
Using >, <, >=, <=, ==, != : if expression is true or false
```
int a = 5
a > 5 is false
a != 5 is false
a == 5 is true
```

**Comparing Strings**
.equals() method
```
“yes”.equals(“yes”);
```

**Comparing Objects**
To compare objects, you need to use == or != which compares two objects
true == true → true
false != true → true
6 == “6” → false

**for loop, enhanced for loop**
for loop is used to repeat an action for a known amount of times and keep track of the index each iteration of the loop

https://replit.com/@Cheesybob127/FRQ-4-Rohan#Hackathonone.java 
In this instance, a for loop should be applied since we require the index of the loop to pick out individual characters in the String to compare to the previous character
The enhanced for loop is simply an easier way of iterating through elements of a collection
used when the index is irrelevant
ex: 

```

for (int x : Array) {
    Action
}

**while loop versus do while loop**
while loops are used to repeat a certain action when a condition is met until the condition, is not met
https://github.com/jli615/lebroncs/blob/79a260d418e43bad63996e92be8d2528ccee1469/src/main/java/com/example/sping_portfolio/minilabs/arithmeticTwo/arithWhile.java#L12 
do-while loops are used when the condition check is conducted after the action. This is usually implemented when the initial condition is not logically viable until the first iteration of the loop must happen
ex:
public int x;
do
{
x=5;
x=x+str.length();
}
while (x<=5)
```

**nested loops**
Loops inside loops
"Link":https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/kianfrqs/FRQ3.java#L11

**Big O notation (Hash map, Binary Search, Single loop, Nested Loop)**
“describes the set of all algorithms that run no worse than a certain speed”
"FRQ3":https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/kianfrqs/FRQ3.java#L11

**Creating a Class, describe Naming Conventions**
use the keywords public and private to determine the visibility of your java class, and make sure to name your class the same name as the java file. Also, enclose all information confined to the file in overarching square brackets.
example for a java file named Dogg
public class Dogg
{
}
ex: https://replit.com/@Cheesybob127/FRQ-4-Rohan#Hackathonone.java:2:1 


**Constructor, describe why there is no return**
Constructors are special methods that are called to create objects of a class
constructors also define the default values received externally for the class, depending on the parameters given 
https://replit.com/@Cheesybob127/FRQ-4-Rohan#CoinGame1.java:17:1 
Default constructors are used to initializing an object of the class with no parameters
The reason constructors do not have a return type is that it is not called directly from your code when you create an object, but rather the memory allocation compiler which allocates memory for the creation of the object

```

**Accessor methods, relationship to getter**
Accessor methods are methods used to retrieve the values of local private variables of a class, they are called getter methods because they “get” these values.
https://github.com/shekark642/slackbots-p2/blob/2dbe4c040e43650c3c524647508ceb9f584da2d5/src/main/java/com/nighthawk/csa/data/SQL/Game.java#L26 
```

**Mutator methods, relationship to setter, describe void return type**
Mutator methods are used for other classes to set different values to local private variables used a class, which they don’t have direct access to. They are called setters. They do not return a value back to the controller class, therefore their void return type

https://github.com/shekark642/slackbots-p2/blob/2dbe4c040e43650c3c524647508ceb9f584da2d5/src/main/java/com/nighthawk/csa/data/SQL/Game.java#L33 

```

**Static variables, Class variables**
Static variables are variables in which one instance of the variable is shared across all instances of a class.
Used for unchanged variables and constants common to all objects of a class.
class variables are variables which create a new instance for every object which is instantiated(Opposite of static variables)
Use for variables individual to each object
https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/data/DataOps/genericDataModel/Password.java#L10 

```

**Static methods, Class methods**
Static methods are methods of a class that belongs to the class, not an instance of a class. Therefore, they can be used without creating an instance of a class.
one example is the main function to run java classes currently,
Code:
```
public class hello
public static void main(String[] args)
{
}
```
we do not need to create an instance of the class “hello” to use the method main and run the class.
```

**this Keyword**
this keyword is used to reference a variable to its corresponding current object and to avoid naming conflicts
Code:
```
for example:
```
int height;
int weight;

public void man(int height, int weight)
{
this.height=height;
this.weight=weight;
}
```

**main method, tester methods**
a main method is the entry point of execution
Common syntax is public static void main(String[] args)
a tester method is used to test the variables manipulated in the method.
https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/kianfrqs/Data.java#L19 


**Inheritance, extends**
a concept used on the object-oriented programming in java where classes share properties, methods, and variables
the extends keyword extends a class’s properties and functions to another class
is used in the declaration statement of the class
https://github.com/jli615/lebroncs/blob/79a260d418e43bad63996e92be8d2528ccee1469/src/main/java/com/example/sping_portfolio/minilabs/arithmeticTwo/arithFor.java#L10 

**Subclass constructor, super Keyword**
when you use the super keyword, you refer it in context with the parent abstract class
https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/data/DataOps/genericDataModel/Password.java#L31 

**Overriding a method, same signature of a method**
Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes.
		Example:
```
			Class Animals with method "sound" that prints a line 3 times
			Child classes dog and cat with same method "sound"
			object of the child classes print out different print lines
```

**Abstract Class, Abstract Method**
abstract classes, more often called parent classes are restricted classes where you cannot make an instance of the class. 
https://github.com/jli615/lebroncs/blob/79a260d418e43bad63996e92be8d2528ccee1469/src/main/java/com/example/sping_portfolio/minilabs/arithmeticTwo/parentArithmetic.java#L5 
Abstract methods cannot be called and are usually rewritten by the child class
https://github.com/jli615/lebroncs/blob/79a260d418e43bad63996e92be8d2528ccee1469/src/main/java/com/example/sping_portfolio/minilabs/arithmeticTwo/parentArithmetic.java#L12 

**Object superclass methods: toString(), compare(), clone()**
These things are at the top of the list and are most important. tostring makes the object into a string, compare creates a positive or negative value based on two objects, clone makes a new object 
"Link":https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/kianfrqs/Data.java#L65

```

        int a = 10;
        int b = 20;
 
        System.out.println(Object.compare(a, b));

```

**Late binding of object, referencing superclass object, ie Animal a = new Chicken(); Animal b = new Goat();**
An object is late bound when it is assigned to a variable declared to be of type Object. 
Objects of this type can hold references to any object, but lack many of the advantages of early-bound objects.
"Link":https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/kianfrqs/Hackathon1.java#L45

**Polymorphism: any of overloading, overriding, late binding**
"One way":https://github.com/shekark642/slackbots-p2/blob/master/src/main/java/com/nighthawk/csa/data/DataOps/genericDataModel/Password.java
"Another way":https://github.com/shekark642/slackbots-p2/blob/master/src/main/java/com/nighthawk/csa/kianfrqs/Password.java

**Web API, REST, FETCH, Async, Request, Response**
"Request and Response":https://github.com/shekark642/slackbots-p2/blob/5d6bd816eb2bf782bbcf4cc05e37cb2a230d8fb3/src/main/java/com/nighthawk/csa/kianfrqs/FRQController.java#L17
"Web API":https://github.com/shekark642/M222-Slackbotss/blob/main/src/main/java/com/example/sping_portfolio/controllers/WEBAPI/APIcontroller.java

**CRUD**
Stands for Create, Read, Update, and delete representing the four basic processes of a properly configured database
Requires a POJO Java class connected to a sql repository
https://github.com/shekark642/slackbots-p2/blob/master/src/main/java/com/nighthawk/csa/data/SQL/Game.java#L33 


## Old TPT Notes (unformatted)


TPT Notes:
Public Access Modifiers
No restriction on access
Other classes can access
Default Constructor
Overload constructor
Accessor methods
Mutator methods
Private access modifiers
Restriction on access
Access in given class only
Instance Variables
Accessor Methods (Getters)
Allow safe access to instance variables
Often referred to as get methods
Sometimes referred to as getters
If a different class wants to access an instance variable, then accessor methods are necessary. 
Must be Public
Return type must match type of instance
No parameters
getNameOfVariable
Ex: getCar(){ return car }
Mutator Method
Allow the change of values for instance variables
Referred to as set methods
Sometimes referred to as setters
Mutators are necessary to modify any instance variables from any class
Must be set to Public
Return type must be void
Changes variable, does not set a new one, no return
Arrays
Array is a data structure used to implement a collection (list of primitive or object reference data)
Element is a value in an array
Index is the position of an element in an array
Length is the number of elements in the array


TPT
While loop
Repeating a statement 
Instructions
For loops
Examples
School ids
Fibonacci sequence - iterating addition of the previous number every time
Fibonacci Minilab
Have one of the following
Geometric sequence
Arithmetic sequence
Lucas numbers
Yellowstone permutations
Factorials
padovan/perrin sequence
Must use one interaction from today


TPT Notes:

index : the position of an element in an array (starts with 0)
Array is a data structure used to implement list of primitive or object reference data
Element is a single value in the array
Length of an array is number of elements in the array
Length is a public final data member of an array
Enhanced for Loop

Use arrays with for loops to make sure the loop iterates through the entire array. Makes iterating a lot easier, for loop ends when index = final array length
Array is fixed length, fundamental java feature
ArrayList 
is resizeable, part of a framework, class with many methods, designed to be flexible
Arraylists are the normal lists used in python
Objects are designed to only store references to objects, not primitive values
Workaround is to use Wrapper classes, which store primitive values as objects

.set(index, value) sets the index to a certain value and moves everything at the index and to the right over one index
.remove(index) removes the value at the given index
.get(index) returns the value at the given index



Tech Talk notes:
SQL Databases
@ in Java
“Lazy Programmers”
Built in functions to java that can be called
Decorator (Calls code and layers it on top of other code)
Rest API
Send data through the internet
JSON usable in different applications for different people
Model
Application Data (POJO’s)
Plain Old Java Object
View
Thymeleaf
Rendering and visualizing data on the html
Controller
Processes user requests
Links


Tech Talk notes:
Different types of APIs
RESTFUL(Rapid)
https://rapidapi.com/hub
Hashmaps, JSON are pair data
Types of structures:
Array
Arraylist
2D structure
JSON
“Key”:“Value”
data example controller
