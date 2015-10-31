/**
 * Write a string compression algorithm that uses the count of sequential characters to shorten the string.
 * e.g. "aabbcccdd" -> "a2b2c3d2"
 */
object compressString {
  def apply(s: String): String = {
    var compressedString: String = ""
    if (!s.isEmpty) {
      var char: Char = 'a'
      var charCount: Int = 0
      for (c <- s) {
        if (c == char) {
          charCount += 1
        } else {
          compressedString += char + charCount.toString
          char = c
          charCount = 1
        }
      }
      compressedString += char + charCount.toString
    }
    compressedString
  }

  def main(args: Array[String]) {
    print("compressString")
    assert(compressString("").equals(""))
    assert(compressString("aaabb").equals("a3b2"))
    assert(compressString("ab").equals("a1b1"))
    println(" ✓")
  }
}
