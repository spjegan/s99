package scala.s99

/**
  * Created by jegan on 3/26/16.
  */
object P11 {

  def encodeModified[A](lst: List[A])(f: (A, A) => Boolean): List[Any] =
    P10.encode(lst)(f).map { tup => if (tup._1 == 1) tup._2 else tup }
}
