import org.scalatest.funsuite.AnyFunSuite

class testSolution04 extends AnyFunSuite {
  test("Solution04"){
    assert(Solution04.doubler(3)(Solution04.fun) === 3)
    assert(Solution04.doubler(5)(Solution04.fun) === 5)
  }
}
