object Solution03 extends App {
  def countLen(list:List[Int]):Int = {
    list.indexOf(list.last)+1
  }
  println(countLen(List(1,2,3)))

}
