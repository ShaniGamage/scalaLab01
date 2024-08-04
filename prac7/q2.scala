object squreNum{

    def calculateSqure(list:List[Int]):List[Int]={
        return (list.map(x=>x*x));
    }

    def main(args: Array[String]): Unit = {
        var mylist=List(1,2,3,4,5);
        println(calculateSqure(mylist));
    }
}