package com.s99.list

/**
  * Created by jegan on 1/30/16.
  */
object P01 {

  def last[A](list: List[A]): Option[A] = list match {
    case x :: Nil => Some(x)
    case _ :: xs => last(xs)
    case Nil => None
  }
}
