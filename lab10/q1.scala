class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  // Calculate the greatest common divisor (GCD)
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // Simplify the rational number using GCD
  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  // Negate the rational number
  def neg: Rational = new Rational(-numerator, denominator)

  def add(that: Rational): Rational = {
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )
  }

   // Method to subtract two rational numbers
  def sub(that: Rational): Rational = {
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )
  }

  // Override toString for better output format
  override def toString: String = s"$numerator/$denominator"

  

}

// Example usage
object RationalTest {
  def main(args: Array[String]): Unit = {

    // Define the rational numbers
  val x = new Rational(3, 4)  // x = 3/4
  val y = new Rational(5, 8)  // y = 5/8
  val z = new Rational(2, 7)  // z = 2/7

  // Perform the operation x + y - z
  val result = x.add(y).sub(z)

  // Print the result
  println(s"The result of x + y - z is: $result")


    val a = new Rational(3, 4)
    println(s"x: $a")        // Output: x: 3/4
    println(s"-x: ${a.neg}") // Output: -x: -3/4

   
  }
}
