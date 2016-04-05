package com.s99.list

/**
  * Created by jegan on 3/29/16.
  */
object P22 {

  def range(from: Int, to: Int): List[Int] = (from to to).flatMap(List(_)).toList

  def rangeR(from: Int, to: Int): List[Int] = {
    if (from > to) Nil
    else from :: rangeR(from + 1, to)
  }
}
