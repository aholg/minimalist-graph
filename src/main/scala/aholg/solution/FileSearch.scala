package aholg.solution

import java.nio.file.Path

class FileSearch(graph: Graph[Path]) extends DFS(graph) {

  def scalaFiles(dir: Path): List[Path] = {
    traverse(dir).filter(_.toFile.getName.endsWith(".scala"))
  }
}
