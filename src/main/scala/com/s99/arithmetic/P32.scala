package com.s99.arithmetic

/**
  * Created by Jegan on 4/1/16.
  */
object P32 {

  def gcd(n1: Int, n2: Int): Int = (n1, n2) match {
    case (0, _) => n2
    case (_, 0) => n1
    case _ =>
      val rem = n1 % n2
      gcd(n2, rem)
  }
}
