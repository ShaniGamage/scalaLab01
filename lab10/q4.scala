// Define the Account class with an account number and balance
case class Accounts(accountNumber: String, balance: Double)

object BankApp extends App {
  
  // 4.1 List of Accounts with Negative Balances
  def negativeBalanceAccounts(accounts: List[Accounts]): List[Accounts] = {
    accounts.filter(_.balance < 0)
  }

  // 4.2 Calculate the Sum of All Account Balances
  def totalBalance(accounts: List[Accounts]): Double = {
    accounts.map(_.balance).sum
  }

  // 4.3 Calculate Final Balances After Applying Interest
  def applyInterest(accounts: List[Accounts]): List[Accounts] = {
    accounts.map(account => {
      if (account.balance > 0) {
        account.copy(balance = account.balance * 1.05) // Apply 5% interest for positive balance
      } else {
        account.copy(balance = account.balance * 1.10) // Apply 10% overdraft interest for negative balance
      }
    })
  }

  // Sample list of accounts
  val accounts = List(
    Accounts("A001", 500.0),
    Accounts("A002", -200.0),
    Accounts("A003", 1500.0),
    Accounts("A004", -50.0),
    Accounts("A005", 0.0)
  )

  // Test the functions

  // 4.1 List of Accounts with Negative Balances
  val negativeAccounts = negativeBalanceAccounts(accounts)
  println(s"Accounts with negative balances: $negativeAccounts")

  // 4.2 Calculate the sum of all account balances
  val total = totalBalance(accounts)
  println(s"Total balance of all accounts: $total")

  // 4.3 Calculate final balances after applying interest
  val updatedAccounts = applyInterest(accounts)
  println(s"Accounts after applying interest: $updatedAccounts")
}
