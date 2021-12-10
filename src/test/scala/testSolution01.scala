import org.scalatest.funsuite.AnyFunSuite

class testSolution01 extends AnyFunSuite {
  test("Solution01"){
    assert(Solution01.maxTupleValue((7,8,9),Solution01.maxValue) === 9)
    assert(Solution01.maxTupleValue((73,87,42),Solution01.maxValue) === 87)
  }
}
