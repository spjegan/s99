package com.s99.list

/**
  * Created by jegan on 3/26/16.
  */
object P14 {

  def duplicate[A](lst: List[A]): List[A] = lst flatMap { a => List(a, a) }
}
