package scala.s99

import org.scalatest.{FunSpec, Matchers}

import scala.s99.P03._

/**
  * Created by jegan on 1/30/16.
  */
class P03$Test extends FunSpec with Matchers {

  it("should return kth element") {
    kth(List(1, 2, 3, 4, 5), 2) should be (Some(3))
  }

  it("should return none if k is bigger than list size") {
    kth(List(1, 2, 3, 4, 5), 5) should be (None)
  }

  it("should return none on empty list") {
    kth(List(), 2) should be (None)
  }
}
