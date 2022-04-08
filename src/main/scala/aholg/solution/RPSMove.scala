package aholg.solution

sealed trait RPSMove

case object Rock extends RPSMove

case object Scissors extends RPSMove

case object Paper extends RPSMove

object RPS extends Graph[RPSMove] {
  def edges(v: RPSMove): List[RPSMove] = v match {
    case Rock => List(Scissors)
    case Scissors => List(Paper)
    case Paper => List(Rock)
  }
}