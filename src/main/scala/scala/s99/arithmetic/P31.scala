package arithmetic

/**
  * Created by Jegan on 4/1/16.
  */
object P31 {

  def isPrime(n: Int): Boolean = {
    val sqr = Math.sqrt(n).toInt
    val nonPrimes = for (i <- 2 to sqr if n % i == 0) yield i
    nonPrimes.isEmpty
  }
}
