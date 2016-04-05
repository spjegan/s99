package arithmetic

/**
  * Created by Jegan on 4/1/16.
  */
object P34 {

  def totient(n: Int) = {
    val list = for (i <- 1 to n if P33.isCoPrime(i, n)) yield i
    list.size
  }
}
