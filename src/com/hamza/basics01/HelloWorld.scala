package com.hamza.basics01

/**
 * This is the main object for our first application.
 */
object HelloWorld {

  /**
   * This is the main method of our application
   *
   * @param args the args to the application
   */
  def main(args: Array[String]): Unit = {

    val name = "Hamza";
    val value = 43; // final declaration
    var age = 23;
    age += 1

    // String, Int, Double, Char, Boolean, Unit,

    // Tuple Type
    val t = (1, 2, "hi");
    val (a, b, c) = t
    println(t._1) // prints the first element

    println("Hello World")

    val message = name + " is " + age + " years old";
    // String interpolation
    val message2 = s"$name is $age years old";
    val str = s"The second element of t is ${t._2}";

    val min = value min age

    name == "Hamza" // true, checks the equality

  }
}
