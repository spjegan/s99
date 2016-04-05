package com.s99.list

/**
  * Created by jegan on 3/29/16.
  */
object P21 {

  def insertAtR[A](newA: A, at: Int, lst: List[A]): List[A] = (at, lst) match {
    case (0, x :: xs) => newA :: x :: xs
    case (_, x :: xs) => x :: insertAt(newA, at - 1, xs)
    case (_, Nil) => throw new NoSuchElementException
  }

  def insertAt[A](newA: A, at: Int, lst: List[A]): List[A] = lst.splitAt(at) match {
    case (_, Nil) => throw new NoSuchElementException
    case (Nil, _) if at < 0 => throw new NoSuchElementException
    case (l, r :: rs) => l ::: (newA :: r :: rs)
  }
}
