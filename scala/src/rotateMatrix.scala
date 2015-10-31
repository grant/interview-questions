/**
 * Given an NxN matrix array of ints, rotate the matrix 90 degrees clockwise.
 */
object rotateMatrix {
  def apply(matrix: Array[Array[Int]]): Array[Array[Int]] = {
    val n: Int = matrix.length
    for (layer <- 0 until n / 2) {
      val first: Int = layer
      val last: Int = n - 1 - layer
      for (i <- first until last) {
        val offset = i - first
        val top = matrix(first)(i)
        matrix(first)(i) = matrix(last - offset)(first)
        matrix(last - offset)(first) = matrix(last)(last - offset)
        matrix(last - offset)(last) = matrix(i)(last)
        matrix(i)(last) = top
      }
    }
    matrix
  }

  def main(args: Array[String]) {
    print("rotateImage")
    val matrix: Array[Array[Int]] = Array(
      Array(11, 12, 13),
      Array(21, 22, 23),
      Array(31, 32, 33)
    )
    val expectedRotatedMatrix = Array(
      Array(31, 21, 11),
      Array(32, 22, 12),
      Array(33, 23, 13)
    )

    val actualRotatedMatrix = rotateMatrix(matrix)
    for (y <- 0 until matrix.length - 1) {
      for (x <- 0 until matrix(y).length - 1) {
        assert(expectedRotatedMatrix(y)(x) == actualRotatedMatrix(y)(x))
      }
    }
    println(" ✓")
  }
}
