package scala.s99

/**
  * Created by jegan on 1/31/16.
  */
object P05 {

  def reverse[A](lst: List[A]): List[A] = lst.foldLeft(List[A]())((l, a) => a :: l)
}
