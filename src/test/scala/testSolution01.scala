import org.scalatest.funsuite.AnyFunSuite

class testSolution01 extends AnyFunSuite {
  test("Solution01"){
    assert(Solution01.repeatList(List(1,2,3),3) === List(1,1,1,2,2,2,3,3,3))
    assert(Solution01.repeatList(List(4,5,6),2) === List(4,4,5,5,6,6))
  }
}
