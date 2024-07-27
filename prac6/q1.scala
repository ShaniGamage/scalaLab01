object demo{

    var inventory1 : Map[Int,(String,Int,Double)]=Map(
        501-> ("Apple", 50, 125.00),
        502-> ("Melon", 30, 80.00),
        503-> ("Woodapple", 40, 50.00),
        504-> ("Orange", 65, 85.00),
    )

    var inventory2 : Map[Int,(String,Int,Double)]=Map(
        601-> ("Carrot", 20, 160.00),
        504-> ("Melon", 15, 95.00),
    )

    def getProductnames1(store:Map[Int,(String,Int,Double)]):Unit={
        println(inventory1.values.map(_._1));
    }

    def getTotal1(store:Map[Int,(String,Int,Double)]):Unit={
       val sum = store.values.map { case (_, quantity, price) => quantity * price }.sum;
       println(sum);
    }

    def checkIsempty(store:Map[Int,(String,Int,Double)]):Unit={
        if(store.isEmpty){
            println("Inventory is Empty");
        }else{
            println("Inventory is not Empty");
        }
    }

    def mergeInventory(store1:Map[Int,(String,Int,Double)],store2:Map[Int,(String,Int,Double)]): Map[Int, (String, Int, Double)]={
        store2.foldLeft(store1) { 
            case (acc, (id, (name, quantity, price))) =>
            acc.get(id) match {

               case Some((_, oldQuantity, oldPrice)) =>
               acc + (id -> (name, oldQuantity + quantity, math.max(oldPrice, price)))
               case None =>
               acc + (id -> (name, quantity, price))
            }
      };   
    }

    def printProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $$price")
      case None =>
        println(s"Product ID $productId not found in the inventory.")
    }
  }


    def main(args: Array[String]): Unit = {
        getProductnames1(inventory1);
        getTotal1(inventory1);
        checkIsempty(inventory1);

        var merge=mergeInventory(inventory1,inventory2);
        println("Merged Inventory:")
        merge.foreach { case (id, (name, quantity, price)) =>
            println(s"ID: $id, Name: $name, Quantity: $quantity, Price: $$price")
        }

        printProductDetails(inventory1, 102)

    }
}