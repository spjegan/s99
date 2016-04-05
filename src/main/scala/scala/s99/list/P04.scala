package scala.s99

/**
  * Created by jegan on 1/30/16.
  */
object P04 {

  def size[A](lst: List[A]): Int = {

    def sze(tail: List[A], count: Int): Int = tail match {
      case Nil => count
      case _ :: xs => sze(xs, count + 1)
    }
    sze(lst, 0)
  }
}
