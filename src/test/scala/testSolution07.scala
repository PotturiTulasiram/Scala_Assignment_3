import org.scalatest.funsuite.AnyFunSuite

class testSolution07 extends AnyFunSuite {
  test("Solution07") {
    assert(Solution07.MaxDiff(Array(2, 3, 1, 7, 9, 5, 11, 3, 5)) === 10)
    assert((Solution07.MaxDiff((Array(14, 15, 2, 6, 8, 9, 11)))) === 9)
  }
}
