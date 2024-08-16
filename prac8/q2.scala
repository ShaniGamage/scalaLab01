import scala.io.StdIn

object categorizer{

    println("Enter the integer : ");
    var input=StdIn.readLine().toInt;
     
    var isMultipeThree = (n:Int)=>n%3 == 0;
    var isMultipeFive = (n:Int)=>n%5 == 0;

     /*var result= input match {
        case _ if isMultipeThree(input)=> println("")
     } */

    if(isMultipeThree(input) && isMultipeFive(input)){
        println("Multiple of Both Three and Five");
    }else if(isMultipeFive(input)){
        println("Multiple if Five");
    }
    else if(isMultipeThree(input)){
        println("Multiple of Three");
    }else{
        println("Not a Multiple of Three or Five");
    }

    def main(args: Array[String]): Unit = {
        
    }
}