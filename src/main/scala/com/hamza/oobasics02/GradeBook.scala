package com.hamza.oobasics02

object GradeBook {
  def main(args: Array[String]): Unit = {
    val students = List(new Student("Jane", "Doe"), new Student("Hamza", "Khan"))
    for (s <- students) printStudent(s)
  }

  def printStudent(s: Student): Unit = {
    println(s.firstName + " " + s.lastName)
    println("Grade = " + s.average)
    println("Tests = " + s.tests)
  }
}


