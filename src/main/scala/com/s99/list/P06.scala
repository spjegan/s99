package com.s99.list

/**
  * Created by jegan on 1/31/16.
  */
object P06 {

  def isPalindrome[A](lst: List[A]): Boolean = lst.foldLeft(List[A]())((l, a) => a :: l) == lst
}
