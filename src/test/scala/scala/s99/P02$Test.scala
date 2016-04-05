package scala.s99

import org.scalatest.{FunSpec, Matchers}
import scala.s99.P02._

/**
  * Created by jegan on 1/30/16.
  */
class P02$Test extends FunSpec with Matchers {

  it ("should return penultimate element") {
    penultimate(List(1, 2, 3, 4, 5)) should be (Some(4))
  }

  it("should return none on empty list") {
    penultimate(List()) should be (None)
  }

  it("should return none on single element list") {
    penultimate(List(1)) should be (None)
  }
}
