object incomes{
    
    //Q3
    var n_hours=40;
    var o_hours=30;

    def normal(n_hours:Int):Double=250*n_hours;
    def ot(o_hours:Int):Double=85*o_hours;
    def income():Double= normal(n_hours)+ot(o_hours);
    def tax():Double = income()*0.12;
    def total():Double=income()-tax();
    

    def main(args: Array[String]): Unit = {
        println("Total income : Rs." + total());
        
    }
}