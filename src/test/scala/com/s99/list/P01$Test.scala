package com.s99.list

import com.s99.list.P01._
import org.scalatest.{FunSpec, Matchers}

/**
  * Created by jegan on 1/30/16.
  */
class P01$Test extends FunSpec with Matchers {

  it("should return last element") {
    last(List(1, 2, 3, 4, 5, 6)) should be (Some(6))
  }

  it("should return head on single element list") {
    last(List(1)) should be (Some(1))
  }

  it("should return none on empty list") {
    last(List()) should be (None)
  }
}
