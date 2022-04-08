package aholg.solution

import java.nio.file.{Files, Path}
import scala.jdk.CollectionConverters.IteratorHasAsScala

object PathInstance extends Graph[Path] {
  override def edges(v: Path): List[Path] = {
    val file = v.toFile
    if (file.isDirectory) {
      Files.list(v).iterator().asScala.toList
    } else {
      List.empty
    }
  }
}
