package com.s99.list

/**
  * Created by jegan on 1/30/16.
  */
object P03 {

  def kth[A](lst: List[A], k: Int): Option[A] = lst match {
    case x :: _ if k == 0 => Some(x)
    case _ :: xs => kth(xs, k - 1)
    case _ => None
  }
}
