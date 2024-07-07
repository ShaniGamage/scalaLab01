object demoo{

    def patternMatching(input :Int):Unit={
        /*println("Enter the number : ");
        var input=scala.io.StdIn.readLine();
        var y=input.toInt;*/

        var result=input match{
            case x if (x<=0) => println("Negative/Zero input");
            case x if (x%2==0) => println("Even number is given");
            case x if (x%2!=0) => println("Odd number is given");
        }

    }

    def main(args: Array[String]): Unit = {
        patternMatching(11);

        
    }
}