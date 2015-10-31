import scala.collection.mutable.Stack

/**
 * Implement a queue using two stacks.
 */
object queueFromStacks {

  class Queue[T] {
    private val insertStack: Stack[T] = new Stack()
    private val outputStack: Stack[T] = new Stack()

    def remove(): T = {
      if (outputStack.isEmpty) {
        while (insertStack.nonEmpty) {
          outputStack.push(insertStack.pop())
        }
      }
      outputStack.pop()
    }

    def add(t: T) = {
      insertStack.push(t)
    }
  }

  def main(args: Array[String]) {
    print("queueFromStacks")
    val q: Queue[Int] = new Queue()
    q.add(1)
    q.add(2)
    q.add(3)
    assert(q.remove() == 1)
    assert(q.remove() == 2)
    assert(q.remove() == 3)
    println(" ✓")
  }
}