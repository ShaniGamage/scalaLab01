object primeNum{

    def isPrime(x:Int):Boolean={
        if(x<=1){
            return false;
        }
        for(i <- 2 to Math.sqrt(x).toInt){
            if(x%i ==0){
                return false;
            }
        }
        true;
    }

    def filterPrime(list:List[Int]):List[Int]={
        return (list.filter(x=> isPrime(x)));
    }

   

    def main(args: Array[String]): Unit = {
        var mylist=List(1,2,3,4,5,6,7,8,9,10);
        println(filterPrime(mylist));
    }
}