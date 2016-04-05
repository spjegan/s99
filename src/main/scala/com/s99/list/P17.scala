package com.s99.list

/**
  * Created by jegan on 3/26/16.
  */
object P17 {

  def split[A](n: Int, lst: List[A]): (List[A], List[A]) = (n, lst) match {
    case (0, xs) => (Nil, xs)
    case (i, x :: xs) if i <= n =>
      val sp = split(n - 1, xs)
      (x :: sp._1, sp._2)
    case (_, List()) => (Nil, List())
  }
}
