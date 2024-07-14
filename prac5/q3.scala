object Fibonacci {
  
  def main(args: Array[String]): Unit = {
    print("Enter the number of Fibonacci numbers to generate: ")
    val n = scala.io.StdIn.readInt()
    println(s"The first $n Fibonacci numbers are:")
    printFibonacciNumbers(n)
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacciNumbers(n: Int): Unit = {
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
    println()
  }
}
