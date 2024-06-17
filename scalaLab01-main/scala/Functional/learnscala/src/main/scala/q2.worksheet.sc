object Main {
  
  def main(args: Array[String]): Unit = {

    //Question 01
    def area(r:Double):Double=r*r*math.Pi;
    var areaofDisk=area(5);
    println("Area of the disk is : "+areaofDisk);

    //Question 02
    def temperature(c:Double):Double=c*1.8000+32.00;
    var temp=temperature(35);
    println("Temperature in Farenhite : "+temp+"F");

    //Question 03
    def sphereArea(radius:Double):Double=4/3*radius*radius*radius;
    var sArea=sphereArea(5);
    println("Sphere Area : "+sArea);

     //Question 04
    var price=24.95;
    var num=60;
    def coverPrice():Double=price*num;
    def discount():Double=coverPrice()*0.4;
    def firstShipping():Double=50*3;
    def remainShipping():Double=(num-50)*0.75;
    def totalCost():Double=coverPrice()-discount()+firstShipping()+remainShipping();
    var cost=totalCost();
    println("Total cost is : "+"Rs."+cost);

    //Question 05
    def easyPace(duration:Double):Double=8*duration;
    def Tempo(duration:Double):Double=7*duration;
    def totalTime()=easyPace(2)*2+Tempo(3);
    var time=totalTime();
    println("Total time : "+time+" min");

  }
}