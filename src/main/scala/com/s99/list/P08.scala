package com.s99.list

/**
  * Created by jegan on 1/31/16.
  */
object P08 {

  def dedup[A](lst: List[A])(f: (A, A) => Boolean): List[A] = lst.foldRight(List[A]())((a, l) => {
    l.headOption match {
      case Some(x) if f(a, x) => l
      case _ => a :: l
    }
  })
}
