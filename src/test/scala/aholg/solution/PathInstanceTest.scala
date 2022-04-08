package aholg.solution

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import java.nio.file.Path

class PathInstanceTest extends AnyFunSuite with Matchers {

  test("Should return the child files of a directory") {
    val result = PathInstance.edges(Path.of("./src"))
    result shouldEqual List(Path.of("./src/main"), Path.of("./src/test"))
  }

  test("Should return no edges for empty directory") {
    val result = PathInstance.edges(Path.of("./build.sbt"))
    result shouldBe empty
  }
}
