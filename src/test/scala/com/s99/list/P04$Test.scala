package com.s99.list

import com.s99.list.P04._
import org.scalatest.{FunSpec, Matchers}

/**
  * Created by jegan on 1/30/16.
  */
class P04$Test extends FunSpec with Matchers {

  it("should return correct size") {
    P04.size(List(1, 2, 3, 4)) should be (4)
  }

  it("should return correct size on empty list") {
    P04.size(List()) should be (0)
  }

}
