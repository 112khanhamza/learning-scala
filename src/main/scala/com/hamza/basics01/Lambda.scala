package com.hamza.basics01

object Lambda {

  def main(args: Array[String]): Unit = {

    val square: Double => Double = x => x * x;
    println(square(23))
    val twice: Double => Double = _ * 2
    val lt: (Double, Double) => Boolean = _ < _

    def sqaure(x: Double): Double = x * x;
  }

}
