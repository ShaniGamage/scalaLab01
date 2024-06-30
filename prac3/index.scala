
object Demo {
  
    def reverse(str: String): String = {
        if (str.isEmpty) {
            ""
        } else {
            reverse(str.tail) + str.head
        }
    }
    
    
    def mylist(list:List[String]) : List[String]={
        list.filter(_.length() > 5);
    }

    def average(num1: Int, num2: Int): Double = {
        val mean = (num1 + num2).toDouble / 2
        BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

   
    def sumoflist(list:List[Int]):Int={
        list.filter(_%2==0).sum;
    }

   

    def main(args: Array[String]): Unit = {
        println("Reversed string :" +reverse("Hello world"));
        
        
        var list1=List("apple","kiwi","banana","cherry");
        println(list1);
        println("Filtered list : " + mylist(list1));

        var result = average(10, 15);
        println(f"Arithmetic Mean : $result%.2f");

        var list2=List(1,4,6,7,3);
        val sum=sumoflist(list2);
        println("Sum of even numbers : "+sum);

       
    }

}


