package com.hamza.polymorphism

import io.StdIn._

object SampleCode {
    def square(x: Double) = x*x // Abstraction

    def sumValues(n: Int): Double = {
        if (n < 1) 0.0 else readDouble() + sumValues(n - 1);
    }

    def productValues(n: Int): Double = {
        if (n < 1) 1.0 else readDouble() * productValues(n - 1);
    }

    def combineValues(n: Int, base: Double, operator: (Double, Double) => Double): Double = {
        if (n < 1) base else operator(readDouble(), combineValues(n-1, base, operator))
    }

    def bubbleSort(arr: Array[Double]): Unit = {
        for (i <- 0 until arr.length-1; j <- 0 until arr.length-1-i) {
            if (arr(j+1) < arr(j)) {
                val tmp = arr(j);
                arr(j) = arr(j+1)
                arr(j+1) = tmp
            }
        }
    }

    def product(x: Double, y: Double): Double = {
        x*y
    }

    def main(args: Array[String]): Unit = {
        println(sumValues(2))
        println(combineValues(2, 1, product))
    }

}
