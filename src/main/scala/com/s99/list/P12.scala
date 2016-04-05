package com.s99.list

/**
  * Created by jegan on 3/26/16.
  */
object P12 {

  def decode[A](lst: List[(Int, A)]): List[A] = lst flatMap { tup => List.fill(tup._1)(tup._2) }
}
