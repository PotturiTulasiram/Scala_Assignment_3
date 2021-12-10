import org.scalatest.funsuite.AnyFunSuite

class testSolution02 extends AnyFunSuite {
  test("Solution02"){
    assert(Solution02.max(2,3) === 3)
    assert(Solution02.min(2,3) === 2)
    assert(Solution02.SecEle(2,3) === 3)

    assert(Solution02.max(100,50) === 100)
    assert(Solution02.min(100,50) === 50)
    assert(Solution02.SecEle(100,50) === 50)

    assert(Solution02.max(10,10) === -1)
    assert(Solution02.min(10,10) === -1)
    assert(Solution02.SecEle(10,10) === 10)
  }
}
