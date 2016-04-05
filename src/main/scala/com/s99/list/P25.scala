package com.s99.list

/**
  * Created by jegan on 3/30/16.
  */
object P25 {

  def randomPermute[A](lst: List[A]): List[A] = P23.randomSelect(lst.length, lst)
}
