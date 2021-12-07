object Solution02 extends App {
  def Oddpos(list:List[Int]):List[Int] = {
    list.indices.collect{ case x if x%2 != 0 => list(x)}.toList
  }
  val newList = Oddpos(List(2,5,3,62,7,3,98))
  newList.foreach(println)
}
