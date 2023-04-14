package com.hamza.basics01

import scala.io.StdIn.readLine

object Recursion {
  def main(args: Array[String]): Unit = {
    val lst = buildList();
    println(lst)
    println(concatString(lst))

    val Array(a, b, c) = "one two three".split(" ")

    grade(assignments = List(45, 90), quizzes = List(87, 69))
  }

  def buildList(): List[String] = {
    val input = readLine()
    // base case
    if (input == "quit") Nil
    else input :: buildList()
  }

  def concatString(words: List[String]): String = {
    if (words.isEmpty) ""
    else words.head + concatString(words.tail);
  }

  def concatStringsPat(words: List[String]): String = words match {
    case Nil => ""
    case h :: t => h + concatStringsPat(t)
  }

  // Combining named and default agr
  def grade(quizzes: List[Int] = Nil, assignments: List[Int] = Nil, tests: List[Int] = Nil): Double = {
    ???
  }
}
