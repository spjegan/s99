package com.s99.list

import com.s99.list.P05._
import org.scalatest.{FunSpec, Matchers}

/**
  * Created by jegan on 1/31/16.
  */
class P05$Test extends FunSpec with Matchers {

  it("should reverse the list") {
    reverse(List(1, 2, 3, 4, 5)) should be (List(5, 4, 3, 2, 1))
  }

  it("two reverses should return the initial list") {
    reverse(reverse(List(1, 2, 3, 4, 5))) should be (List(1, 2, 3, 4, 5))
  }

  it("reverse on single list should return the same list") {
    reverse(List(1)) should be (List(1))
  }

}
