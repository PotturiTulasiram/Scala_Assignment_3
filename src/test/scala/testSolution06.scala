import org.scalatest.funsuite.AnyFunSuite

class testSolution06 extends AnyFunSuite {
  test("Solution06"){
    assert(Solution06.MaxProduct(Array(2, 3, 5, 7, -7, 5, 8, -5)) === 56)
    assert(Solution06.MaxProduct(Array(3,6,-9,10,-10,5,2)) === 90)
  }
}
