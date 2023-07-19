## Shape Stacker

There is an object called ShapeStacker. You give this object a series of shape objects and ask it to "stack!" which will be as though a person were laying down shapes on a table on top of each other. They are stacked with the largest shape on bottom to the smallest shape on top so that you can see some portion of all the shapes.

**For example:**   
![Imagine a large Triangle with a smaller Circle with a Square inside of it](http://ir-interviews.herokuapp.com/images/shapes.png)   

Output representation in code:   

**T[C[S]]** -> This means you see the triangle which contains the circle which contains the square. You give to ShapeStacker

 * Add Square with side length: 10
 * Add Triangle with side 1: 20, sides 2 & 3: 22
 * Add Circle with diameter: 7

**ShapeStacker stack yields**

 * Prints "T[C[S]]"

### Getting Started
This project comes with a Gradle wrapper but you will need Java installed.   
These commands should work:   

 * `./gradlew run`
 * `./gradlew test`

### Evaluation Criteria

This is an object-oriented exercise. At a minimum, you should code objects for ShapeStackerTest, ShapeStacker, Circle, Square, Triangle, and Rectangle.

It's up to you to determine the order to appear when stacked based on sizes and what fits inside what.

It's up to you to decide how to handle the case where two shapes cover the same area. i.e. Square (side:4) and Rectangle (length: 4, width: 4)

ShapeStackTest cases:

 * Assert(Square(4), Circle(4), Triangle(4,10), "T[S[C]]")
 * Assert(Square(4), Circle(6), Rectangle(2,4), "C[S[R]]")
 * Assert(Triangle(4,10), Circle(20), "C[T]")
 * Assert(Square(4), Rectangle(4,4), ???)

### CodeSubmit

Please organize, design, test, and document your code as if it were
going into production - then push your changes to the master branch.

Have fun coding! 🚀
