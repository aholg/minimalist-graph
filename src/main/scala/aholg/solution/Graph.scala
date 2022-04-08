package aholg.solution

trait Graph[T] {
  def edges(v: T): List[T]
}
