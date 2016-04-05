package com.s99.list

/**
  * Created by jegan on 3/30/16.
  */
object P24 {

  def lotto(n: Int, to: Int): List[Int] = P23.randomSelect(n, P22.range(1, to))
}
