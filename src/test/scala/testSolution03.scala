import org.scalatest.funsuite.AnyFunSuite

class testSolution03 extends AnyFunSuite {
  test("Solution03"){
    assert(Solution03.curriedFunction(2)(10) === 20)
    assert(Solution03.curriedFunction(4)(5) === 20)
  }
}
