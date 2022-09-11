import java.util.Scanner

fun main(args: Array<String>) {
    //Creating a Variable for the input object
    val Scanned = Scanner(System.`in`)

    //Initializing Variables
    var square = Square("square")
    var circle = Circle("circle")
    var triangle = Triangle("triangle")
    var equilateralTriangle = EquilateralTriangle("equilateralTriangle")

    //Prompts the user input

    //______________________________________________________//

    //Square
    print("\tLength of Square: ")
    val length:Double = Scanned.nextDouble()
    print("\tHeight of Square: ")
    val height:Double = Scanned.nextDouble()

    //Setting Dimensions for Square
    square.setDimensions(length,height)

    //Printing Result
    println(" "+ square.printDimensions() + "\n\tArea: " + square.getArea())

    //______________________________________________________//

    //Circle
    print("\n\tRadius of Circle: ")
    val radius:Double = Scanned.nextDouble()

    //Setting Dimensions for Circle
    circle.setDimensions(radius)

    //Printing Result
    println(" "+ circle.printDimensions() + "\n\tArea: " + circle.getArea())

    //______________________________________________________//

    //Triangle
    println("\n\tWhat are the 3 Sides of your triangle?")
    print("\tSide 1: ")
    val Side1:Double = Scanned.nextDouble()
    print("\tSide 2: ")
    val Side2:Double = Scanned.nextDouble()
    print("\tSide 3: ")
    val Side3:Double = Scanned.nextDouble()

    //Setting Dimensions for Triangle
    triangle.setDimensions(Side1,Side2,Side3)

    //Printing Result
    println(" "+ triangle.printDimensions() + "\n\tArea: " + triangle.getArea())

    //______________________________________________________//

    //Equilateral Triangle
    print("\n\tSide of Equilateral Tri: ")
    val side:Double = Scanned.nextDouble()

    //Setting Dimensions for Triangle

    equilateralTriangle.setDimensions(side)

    //Printing Result
    println(" "+ equilateralTriangle.printDimensions() + "\n\tArea: " + equilateralTriangle.getArea())
    //______________________________________________________//

}