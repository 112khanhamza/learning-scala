package com.hamza.basics01

object Condition {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val age = 23;

    var i = 0
    while (i < 10) {
      println(i)
      i += 1
    }

    i = 0
    do {
      i += 1
      println(i)
    } while (i < 10)

    val response = if (age < 18) {
      "No entry"
    } else {
      "Come in"
    }
    println(response)

    println(if (age < 18) "No admit" else "Come in")

    val a = if (true) "hi"
  }

}
