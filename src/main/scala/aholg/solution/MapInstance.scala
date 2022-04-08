package aholg.solution


class MapInstance[T](adjacencyMap: Map[T, List[T]]) extends Graph[T] {
  def edges(v: T): List[T] = adjacencyMap.getOrElse(v, List.empty)
}
