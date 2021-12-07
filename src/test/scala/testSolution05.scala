import org.scalatest.funsuite.AnyFunSuite

class testSolution05 extends AnyFunSuite {
  test("Solution05"){
    assert(Solution05.replaceMax(Array(9, 5, 8, 4, -10, 21, 6, 17, 11)) === Array(21, 21, 21, 21, 21, -1, 17, -1, -1))
    assert(Solution05.replaceMax(Array(4,1,7,2,14,5,9,10)) === Array(14,14,14,14,-1,9,-1,-1))
  }
}
