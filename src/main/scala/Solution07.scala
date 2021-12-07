object Solution07 extends App {
  def MaxDiff(arr:Array[Int]):Int = {
    var maxDiff = 0
    val n = arr.length
    for(i <- 0 to n-1){
      for(j <- i+1 to n-1){
        if(arr(i)<arr(j) && (arr(i)-arr(j)).abs>maxDiff) maxDiff = (arr(i)-arr(j)).abs
      }
    }
    maxDiff
  }

  println(MaxDiff(Array(14,15,2,6,8,9,11)))
}
