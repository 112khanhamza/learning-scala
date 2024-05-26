package com.hamza.oodetail03

class MutableVect2D(private[this] var _x: Double, // private[oodetail03] means that _x can be modified by anything under the package oodetail03
                    private[this] var _y: Double) { // private[this] is more restrictive means that _x can be only modified by the current instance of class

    def x = _x;
    def y = _y;

    def x_= (newX: Double): Unit = _x = newX;
    def y_= (newY: Double): Unit = _y = newY;

    def +=(mv: MutableVect2D): MutableVect2D = {
        _x += mv.x
        _y += mv.y
        this
    }

    def -=(mv: MutableVect2D): MutableVect2D = {
        _x -= mv.x
        _y -= mv.y
        this
    }

    def *=(c: Double): MutableVect2D = {
        _x *= c
        _y *= c
        this
    }

    def magnitude = math.sqrt(x*x + y*y)

    def apply(index: Int): Double = index match {
        case 0 => x
        case 1 => y
        case _ => throw new IndexOutOfBoundsException(s"2D vector indexed at $index.")
    }

    def update(index: Int, newValue: Double): Unit = index match {
        case 0 => _x = newValue;
        case 1 => _y = newValue;
        case _ => throw new IndexOutOfBoundsException(s"2D vector updated at $index.")
    }

}

object MutableVect2D {

    def main(args: Array[String]): Unit = {
        val v1 = MutableVect2D(1,2)
        println(v1.magnitude)
        val v2 = MutableVect2D(2,2)
        v1 += v2

        // calls the apply method
        v1.x = 10;

        // calls the update method
        v1(0) = 99;

        // v1 has been changed
        println(v1.magnitude)
    }

    def apply(x: Double, y: Double) = new MutableVect2D(x,y);
}
