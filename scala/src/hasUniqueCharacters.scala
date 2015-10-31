/**
 * Determine if a string has all unique characters.
 */
object hasUniqueCharacters {
  def apply(s: String): Boolean = {
    var chars: Set[Char] = Set()
    for (c <- s) {
      if (chars.contains(c)) {
        return false
      } else {
        chars += c
      }
    }
    true
  }

  def main(args: Array[String]) {
    print("hasUniqueCharacters.scala")
    assert(hasUniqueCharacters(""))
    assert(hasUniqueCharacters("abcdefg"))
    assert(!hasUniqueCharacters("test"))
    assert(!hasUniqueCharacters("abzzcd"))
    println(" ✓")
  }
}
