object Solution01 extends App {
  def repeatList(list: List[Int],n:Int): List[Int] = {
    val flatMapConnd = (x:Int) => List.fill(n)(x)
    list.flatMap(flatMapConnd)
  }

  val resList = repeatList(List(1,2,3),3)
  resList.foreach(println)
}
