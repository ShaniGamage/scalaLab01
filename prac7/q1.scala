object evenNum{

    def filterEvenNumbers(list:List[Int]):List[Int]={
        return (list.filter( x=>(x%2==0)));
       
        
    }

    def main(args: Array[String]): Unit = {
        var mylist=List(1,2,3,4,5,6,7,8,9,10);
        var evenList=filterEvenNumbers(mylist);
        println(evenList);
        
    }
}