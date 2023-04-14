package com.hamza.basics01

import java.io.PrintWriter
import scala.io.Source

object TextFile {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("matrix.txt")
    val lines = source.getLines();
    val matrix = lines.map(line => line.split(" ").map(_.toDouble)).toArray
    source.close()

    val pw = new PrintWriter("rowSums.txt")
    matrix.foreach(row => pw.println(row.sum))
    pw.close()
  }
}
