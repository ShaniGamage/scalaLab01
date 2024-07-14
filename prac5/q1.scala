import scala.io.StdIn.readLine
import scala.compiletime.ops.string

object demo{

    def getProductsList():List[String]={
        var products=List[String]();
        var input="";

        println("Products getting.Please Enter 'done' to finish")
        while(input!="done"){
            input= readLine("Enter product name : ");

            //avoid adding 'done' to the list
            if(input!="done"){
            //append elements to end of the list
                products=products :+ input;
            }
        }
        return products;
    }

    def printProductList(list:List[String]):Unit={
        for(i <- list.indices){
            println(s"${i+1}. ${list(i)}")
        }
    }

    def getTotalProduct(list:List[String]):Unit={
        println("Total no. of products : " + list.length);
    }

    def main(args: Array[String]): Unit = {
        var list=getProductsList();
        printProductList(list);
        getTotalProduct(list);
        
    }
}