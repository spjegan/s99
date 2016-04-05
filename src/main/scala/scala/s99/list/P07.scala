package scala.s99

/**
  * Created by jegan on 1/31/16.
  */
object P07 {

  def flatten(lst: List[Any]): List[Any] = lst.flatMap {
    case l: List[_] => flatten(l)
    case a => List(a)
  }
}
