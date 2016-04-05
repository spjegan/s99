package com.s99.list

/**
  * Created by jegan on 1/30/16.
  */
object P02 {

  def penultimate[A](lst: List[A]): Option[A] = lst match {
    case x :: _ :: Nil => Some(x)
    case _ :: xs => penultimate(xs)
    case _ => None
  }
}
