/**
 * Determine if a string is a palindrome.
 */
object isPalindrome {
  def apply(s: String): Boolean = {
    val i:Int = 0
    for (i <- 0 until s.length - i - 1) {
      if (s.charAt(i) != s.charAt(s.length - i - 1)) {
        return false
      }
    }
    true
  }

  def main(args: Array[String]) {
    print("isPalindrome")
    assert(isPalindrome(""))
    assert(!isPalindrome("abc"))
    assert(isPalindrome("racecar"))
    assert(isPalindrome("baccab"))
    println(" ✓")
  }
}
