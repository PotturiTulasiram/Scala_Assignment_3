import scala.util.Random

object Solution02 extends App {
  val r1 = Random.nextInt()
  val r2 = Random.nextInt()

  def max(a:Int,b:Int) : Int =
    if(a==b) -1
    else if(a>b) a
    else b

  def min(a:Int,b:Int) : Int = {
    if(a==b) -1
    else if(a<b) a
    else b
  }

  def SecEle(a:Int,b:Int) : Int = b

  println("Max of two randoms is "+max(r1,r2))
  println("Min of two randoms is "+min(r1,r2))
  println("Second element to randoms is "+SecEle(r1,r2))
}
