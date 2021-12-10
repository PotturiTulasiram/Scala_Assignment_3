object Solution03 extends App {
  def curriedFunction(a: Int): (Int => Int) = {
    x:Int => x*a
  }

  println(curriedFunction(2)(4))
  //or
  val firstValue = curriedFunction(2)
  println(firstValue(4))
}
