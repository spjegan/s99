package scala.s99

import org.scalatest.{FunSpec, Matchers}

import scala.s99.P08._

/**
  * Created by jegan on 1/31/16.
  */
class P08$Test extends FunSpec with Matchers {

  it("should remove duplicates") {
    dedup(List(1, 1, 2, 3, 3, 3, 4, 4, 5))((i, j) => i == j) should be (List(1, 2, 3, 4, 5))
  }

  it("should not remove non-duplicate elements") {
    dedup(List(1, 2, 3, 4, 5))((i, j) => i == j) should be (List(1, 2, 3, 4, 5))
  }

  it("should work on empty lists") {
    dedup(List())((i, j) => i == j) should be (List())
  }
}
