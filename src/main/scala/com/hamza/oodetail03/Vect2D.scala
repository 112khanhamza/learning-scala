package com.hamza.oodetail03

// This is more of a Java way of writing a class
class Vect2D(val x: Double, val y: Double) {

    // Operators are allowed for naming in scala + - * / % | & ^ ! < > = ? $ \ : ~
    def +/\ = 6
    def abc_+*&! = 42

    // Method Precedence in Scala
    // Other special characters
    // * / %
    // + -
    // :
    // = !
    // < >
    // &
    // |
    // all letters
    // assignment operators

    (2-3)-4

    def +(v: Vect2D) = Vect2D(x + v.x, y + v.y)
    def -(v: Vect2D) = Vect2D(x - v.x, y - v.y)
    def *(c: Double) = Vect2D(x*c, y*c)
    def unary_-() = new Vect2D(-x, -y);
    def magnitude = math.sqrt(x*x + y*y);
    def apply(index: Int): Double = index match {
        case 0 => x
        case 1 => y
        case _ => throw new IndexOutOfBoundsException(s"2D vector indexed at $index.")
    }

}

// Called a companion Object
object Vect2D {

    def main(args: Array[String]): Unit = {
        val v1 = Vect2D(1,2);
        val v2 = Vect2D(2,2);
        val v3 = v1 + v2;
        println(v3.magnitude);
        val v4 = -v1; // applies unary_-() method
        println(v3)
    }

    def apply(x: Double, y: Double) = new Vect2D(x, y);
}
