object Solution05 extends App {
  def conditional(x:Int,p:(Int => Boolean),f:(Int => Int)):Int = if(p(x)) f(x) else x

  def prediction(a:Int) : Boolean = if(a%2 == 0) true else false

  def Sqrt(a:Int) : Int = a*a

  println(conditional(10,prediction,Sqrt))
  println(conditional(5,prediction,Sqrt))
}
