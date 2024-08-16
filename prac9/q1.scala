import scala.io.StdIn
object interest{
    
    val calInterest: Double => Double = deposit => deposit match {
      case d if d < 20000 => d*0.0
      case d if d >= 200000 => d * 0.04
      case d if d <= 2000000 => d * 0.035
      case d if d > 2000000 => d * 0.065
    }

    
    def main(args: Array[String]): Unit = {
        println("Enter your deposit amount : ");
         var deposit= StdIn.readInt();
         var interest=calInterest(deposit)
         print("Interest according your deposit :" +interest);
        
    }
}