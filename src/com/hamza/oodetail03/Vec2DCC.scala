package com.hamza.oodetail03

// If you want to make an Immutable Class then use Case Class
case class Vec2DCC(x: Double, y:Double) {

    def +(v: Vec2DCC) = Vec2DCC(x + v.x, y + v.y)

    def -(v: Vec2DCC) = Vec2DCC(x - v.x, y - v.y)

    def *(c: Double) = Vec2DCC(x * c, y * c)

    def unary_-() = new Vec2DCC(-x, -y);

    def magnitude = math.sqrt(x * x + y * y);
}

object Vec2DCC {
    def main(args: Array[String]): Unit = {
        val v1 = Vec2DCC(1, 2);
        val v2 = Vec2DCC(2, 2);
        val v3 = v1 + v2;
        println(v3.magnitude);
        val v4 = -v1; // applies unary_-() method
        println(v3)
        v3.copy(y = 99)
    }
}
