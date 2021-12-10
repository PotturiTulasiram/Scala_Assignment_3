object Solution01 extends App {
  def maxValue(a:Int,b:Int) :Int =
    if(a>b) a else b

  def maxTupleValue(aTuples:(Int, Int, Int), f:(Int,Int) =>Int ) : Int = {
    maxValue(aTuples._1,maxValue(aTuples._2,aTuples._3))
  }

  println(maxTupleValue((7,2,6),maxValue))
}
