package aholg.solution

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import java.nio.file.Path

class FileSearchTest extends AnyFunSuite with Matchers {

  test("Should return all scala files in DFS order") {
    val result = new FileSearch(PathInstance).scalaFiles(Path.of("./src"))

    result should not be empty
    result.head shouldEqual Path.of("./src/main/scala/aholg/solution/DFS.scala")
    result.last shouldEqual Path.of("./src/test/scala/aholg/solution/PathInstanceTest.scala")
  }
}
