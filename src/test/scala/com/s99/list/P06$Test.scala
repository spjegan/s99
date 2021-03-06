package com.s99.list

import com.s99.list.P06._
import org.scalatest.{FunSpec, Matchers}

/**
  * Created by jegan on 1/31/16.
  */
class P06$Test extends FunSpec with Matchers {

  it("should return true when list is palindrome") {
    isPalindrome(List(1, 2, 3, 2, 1)) should be (true)
  }

  it("should return false when list is NOT palindrome") {
    isPalindrome(List(1, 2, 3, 3, 1)) should be (false)
  }

  it("should return true on empty list") {
    isPalindrome(List()) should be (true)
  }

  it("should return true on single element list") {
    isPalindrome(List(1)) should be (true)
  }
}
