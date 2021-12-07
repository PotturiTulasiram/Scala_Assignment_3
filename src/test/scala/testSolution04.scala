import org.scalatest.funsuite.AnyFunSuite

class testSolution04 extends AnyFunSuite {
  test("Solution04"){
    assert(Solution04.absoluteList(List(1,2,-3,4,-5,-6,22,-53)) === List(1,2,3,4,5,6,22,53))
    assert(Solution04.absoluteList(List(-2,-5,-34,-252,33,6,-1)) === List(2,5,34,252,33,6,1))
  }
}
