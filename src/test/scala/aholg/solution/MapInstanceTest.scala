package aholg.solution

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers


class MapInstanceTest extends AnyFunSuite with Matchers {

  test("Should return adjacent Ints") {
    val graph = new MapInstance[Int](Map(1 -> List(2, 3), 2 -> List(1)))

    graph.edges(1) shouldEqual List(2, 3)
  }

  test("Return empty if no there are no adjacent edges") {
    val graph = new MapInstance[Int](Map(1 -> List(2, 3), 2 -> List(1)))

    graph.edges(4) shouldEqual List.empty
  }
}
