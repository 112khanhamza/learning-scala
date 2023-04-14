val a = 0 to 10;
a.map(_ * 2)
a.filter(_ < 8)
a.count(_ % 2 == 0)
a.exists(_ < 10)
a.exists(_ > 10)
a.forall(_ < 5)
a.forall(_ < 11)
a.find(_ % 4 == 0)
a.partition(_ < 5)

// complex
a.reduce(_+_)
val words = Array("this", "is", "u", "test");
words.minBy(_.length) // length ordering
words.min // alphabetic ordering