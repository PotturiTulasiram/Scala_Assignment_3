import org.scalatest.funsuite.AnyFunSuite

class testSolution05 extends AnyFunSuite {
  test("Solution05"){
    assert(Solution05.conditional(8,Solution05.prediction,Solution05.Sqrt) === 64)
    assert(Solution05.conditional(7,Solution05.prediction,Solution05.Sqrt) === 7)
  }
}
