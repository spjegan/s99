package com.s99.list

/**
  * Created by jegan on 2/2/16.
  */
object P09 {

  def pack[A](lst: List[A])(f: (A, A) => Boolean): List[List[A]] = lst.headOption match {
    case Some(head) =>
      val seq = lst.span(x => f(x, head))
      seq._1 :: pack(seq._2)(f)
    case None => List()
  }
}
