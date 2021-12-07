object Solution04 extends  App {
  def absoluteList(list: List[Int]) : List[Int] = {
    list.map(_.abs)
  }

  println(absoluteList(List(-2,4,-423,3,-43,-51,-55,653)))
}
