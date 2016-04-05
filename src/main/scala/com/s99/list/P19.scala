package com.s99.list

/**
  * Created by jegan on 3/27/16.
  */
object P19 {

  def rotateR[A](n: Int, lst: List[A]): List[A] = (n, lst) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, xs) => xs
    case (i, x :: xs) => rotate(n - 1, xs ::: List(x))
  }

  def rotate[A](n: Int, lst: List[A]): List[A] = lst.splitAt(n) match {
    case (_, Nil) => throw new NoSuchElementException
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (l, r) => r ::: l
  }

}
