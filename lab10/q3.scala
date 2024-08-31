class Account(var balance:Double,var Accname:String){
    def deposit(amount:Double):Unit={
        if(amount>0){
            println("Deposit to "+this.Accname+amount)
            balance=balance+amount;
            println(this.Accname+" balance after the deposit : "+balance)
        }else{
            println("Please enter valid amount")
        }
    }

    def withdraw(amount:Double):Unit={
        if(amount > 0){
            println("withdraw from "+this.Accname+amount)
            balance= balance-amount;
            println(this.Accname+" balance after the withdraw : "+balance)
        }else{
            println("Please enter valid amount")
        }
    }
    
    def transfer(amount:Double,toAcc:Account):Unit={
        if(amount > 0 && this.balance >=amount ){
            println("\nTranfer "+amount+" from "+ this.Accname +" to " + toAcc.Accname)
            this.withdraw(amount)
            toAcc.deposit(amount)
            
        }else{
            println("Please enter valid amount")
        }
    }

    def accountsWithNegativeBalances(accounts:List[Account]): List[Account] = {
    accounts.filter(_.balance < 0)
  }
  
}

object AccountTest extends App {
  val account1 = new Account(100,"YES account")
  val account2 = new Account(500,"18+ account")

  println("Initial states : ")
  println(account1.Accname+" : "+account1.balance)
  println(account2.Accname+" : "+account2.balance)

  account1.deposit(1000)
  account1.transfer(200, account2)
  account2.withdraw(400)


}