object Solution06 extends App {
  def MaxProduct(arr:Array[Int]):Int = {
    var maxPro = arr.max
    val n = arr.length
    for(i <- 0 to n-1){
      for(j <- i+1 to n-1 ){
        if(arr(i)*arr(j) > maxPro) maxPro = arr(i)*arr(j)
      }
    }
    maxPro
  }
  println(MaxProduct(Array(2, 3, 5, 7, -7, 5, 8, -5)))
}
