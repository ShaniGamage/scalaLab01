object demo{

    val items =Array("Shirts","Trousers","skirts","blouses","frocks");
    val quantities=Array(10,30,45,25,50);

    def displayInventory(array1:Array[String],array2:Array[Int]):Any={
        println("Inventory ");
        for(i<- array1.indices){
            println(array1(i) +" : "+ array2(i)  );

        }
    }

    //restocking
    def restockItems(item:String,quantity:Int):Unit={
        var i=items.indexOf(item);

        //if the item exist
        if(i!= -1){
            quantities(i)=quantities(i)+quantity;
            println(s"Restocked ${quantity} of ${item}");
        }else{
            println(s"${item} cannot found from the inventory");

        }

    }

    def sellItem(item:String,quantity:Int):Unit={
        var i=items.indexOf(item);

        //if the item exit 
        if(i!= -1 ){
        
        
          if( quantities(i)==0){
               println(s" Sorry, ${item} is already soldout!");
               
          }else if(quantities(i) < quantity){
               println(s"${item}'s qunatity is not enough to sell");

          }else{
              quantities(i)=quantities(i)-quantity;
              println(s"${quantity} of ${item} sold.")
              println(s"${quantities(i)} of ${item} remains.")

          }
            
          }else{
             println(s"${item} cannot found from the inventory");
        }
    }


    def main(args: Array[String]): Unit = {
        displayInventory(items,quantities);
        println("\n");
        restockItems("frocks",10);
        println("\n");
        sellItem("Trousers",25);
       
        
    }
}
