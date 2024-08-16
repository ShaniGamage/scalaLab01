import scala.io.StdIn

object patternMatching {
    
    // Function pattern returns a String based on the input
    var pattern: Int => String = num => num match {
        case p if p < 0 => "Negative Integer"
        case p if p == 0 => "Zero"
        case p if p % 2 == 0 => "Even Number"
        case p if p % 2 != 0 => "Odd Number"
    }

    def main(args: Array[String]): Unit = {
        println("Enter a number:")
        var n = StdIn.readInt()
        val result = pattern(n)  
        println(result) 
    }
}
