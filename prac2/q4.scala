object ticket{
    
    def attendees(price :Double):Double = 120 + (15 - price)/5*20;
    def cost(price:Double):Double = 500 + attendees(price)*3;
    def revenue(price:Double):Double = attendees(price)*price;
    def profit(price:Double):Double = revenue(price) - cost(price);

    println(profit(5));
    println(profit(10));
    println(profit(15));
    println(profit(20));
    println(profit(25));
    println(profit(30))
    println(profit(35))

    def main(args: Array[String]): Unit = {
        
    }
}