package scala.s99

/**
  * Created by jegan on 3/29/16.
  */
object P20 {

  def removeR[A](n: Int, lst: List[A]): (List[A], A) = (n, lst) match {
    case (0, x :: xs) => (xs, x)
    case (_, x :: xs) =>
      val tup = removeAt(n - 1, xs)
      (x :: tup._1, tup._2)
    case (_, Nil) => throw new NoSuchElementException
  }

  def removeAt[A](n: Int, lst: List[A]): (List[A], A) = lst.splitAt(n) match {
    case (_, Nil) => throw new NoSuchElementException
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (l, r :: rs) => (l ::: rs, r)
  }
}
