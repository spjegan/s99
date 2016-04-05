package com.s99.list

/**
  * Created by jegan on 3/26/16.
  */
object P10 {

  def encode[A](lst: List[A])(f: (A, A) => Boolean): List[(Int, A)] =
    P09.pack(lst)(f).map { e => (e.length, e.head) }
}
