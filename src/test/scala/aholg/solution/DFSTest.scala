package aholg.solution

import aholg.solution.DFSTest.TestClass
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DFSTest extends AnyFunSuite with Matchers {

  test("Should traverse an Int graph") {

    val graph = new MapInstance[Int](Map(1 -> List(2, 3), 2 -> List(4)))

    new TestClass[Int](graph).traverse(1) shouldEqual List(2, 4, 3)
  }
}

object DFSTest {
  class TestClass[T](graph: Graph[T]) extends DFS(graph)

}


