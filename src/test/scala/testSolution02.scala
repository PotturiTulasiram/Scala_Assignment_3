import org.scalatest.funsuite.AnyFunSuite

class testSolution02 extends AnyFunSuite {
  test("Solution02"){
    assert(Solution02.Oddpos(List(1,2,3,4,5,6)) === List(2,4,6))
    assert(Solution02.Oddpos(List(3,525,231,62,54,433)) === List(525,62,433))
  }
}
