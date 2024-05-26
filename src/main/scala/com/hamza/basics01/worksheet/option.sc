val a = Array(3,8,5,7,1,4);
a.find(_ < 3)
a.find(_ > 10)
res0.get
res1 match {
  case Some(i) => i
  case None => 0
}

res1.getOrElse(0)
res1.map(_*2)