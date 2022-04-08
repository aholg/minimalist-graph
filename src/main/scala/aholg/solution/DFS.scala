package aholg.solution

import scala.collection.mutable

abstract class DFS[T](graph: Graph[T]) {
  val discovered = mutable.HashSet.empty[T]

  def traverse(v: T): List[T] = {
    discovered.add(v)
    graph.edges(v).flatMap { w =>
      if(!discovered.contains(w)){
        w :: traverse(w)
      } else {
        List.empty
      }
    }
  }
}
