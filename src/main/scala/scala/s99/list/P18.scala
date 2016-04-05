package scala.s99

/**
  * Created by jegan on 3/27/16.
  */
object P18 {

  def slice[A](n1: Int, n2: Int, lst: List[A]): List[A] = lst.zipWithIndex.filter(t => t._2 >= n1 && t._2 < n2).map(_._1)
}
