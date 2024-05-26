// Array Operations
val a = Array(6,9,7,4,5,8,3)
a.drop(2)
a.dropRight(2);
a.head
a.tail
a.last
a.length
a.splitAt(3)
a.take(3)
a.takeRight(3)
a.slice(2, 5)
a.patch(2, Array(98, 99), 3)
a.diff(Array(1,2,3,4))
a.intersect(List(4,5,6))
a.union(Array(1,2,3))
a.min
a.sum
a.product
a.sorted
a.mkString(", ")
a.mkString("[", ",", "]")
a.zip('a' to 'z') // stops when whichever ends first
a.zipWithIndex