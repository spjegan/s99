package scala.s99

/**
  * Created by jegan on 3/26/16.
  */
object P16 {

  def drop[A](n: Int, lst: List[A]): List[A] = {
    def dropN(i: Int, lst: List[A]): List[A] = (i, lst) match {
      case (0, _ :: xs) => dropN(n, xs)
      case (_, x :: xs) => x :: dropN(i - 1, xs)
      case (_, x) => x
    }
    dropN(n, lst)
  }
}
