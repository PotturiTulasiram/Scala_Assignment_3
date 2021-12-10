object Solution04 extends App {
  def doubler[Int](x:Int)(f:Int=>Unit) : Int = {
    f(x)
    x
  }
  def fun(a:Int):Unit = println(a*2)

  doubler(3)(fun)
}
