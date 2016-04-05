package com.s99.list

import scala.util.Random

/**
  * Created by jegan on 3/29/16.
  */
object P23 {

  def randomSelect[A](n: Int, lst: List[A]): List[A] = (n, lst) match {
    case (_, Nil) if n < 0 => throw new IllegalArgumentException
    case (0, xs) => Nil
    case (_, xs) =>
      val r = Random.nextInt(xs.size)
      val t = P20.removeAt(r, xs)
      t._2 :: randomSelect(n - 1, t._1)
  }
}
