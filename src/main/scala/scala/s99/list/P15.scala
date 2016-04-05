package scala.s99

/**
  * Created by jegan on 3/26/16.
  */
object P15 {

  def duplicateN[A](n: Int, lst: List[A]): List[A] = lst flatMap { a => List.fill(n)(a) }
}
