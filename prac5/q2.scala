import scala.io.StdIn.readLine
class Book(var title:String, var author:String, var isbn:String){}

object library{

    // Initial set of books
    var books: Set[Book] = Set(
    Book("1984", "George Orwell", "4935"),
    Book("To Kill a Mockingbird", "Harper Lee", "35467"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "13565")
  )

  def addBook(addBook: Book):Unit={
    books=books+addBook;
    println(s"${addBook.title} by ${addBook.author} is added to the library");
  }

  def removeBook(isbn:String):Unit={
    var bookToRemove=books.find(_.isbn==isbn);
    bookToRemove match {
        case Some(book) => (books=books-book);
        case _=>println("No book found with the given ISBN");
    }
  }

   def isBookInLibrary(isbn: String): Unit = {
    if(books.exists(_.isbn == isbn)){
        println(s"Book with ${isbn} is found");
    }else{
        println("Book is not found.");
    }
}

    def displayLibrary():Unit={
        if(books.isEmpty){
            println("The library is empty");
        }else{
            println("Library Collection");
            books.foreach(book => println(s"${book.title} by ${book.author}, ISBN: ${book.isbn}"))
        }
    }

    def searchBookByTitle(title: String): Unit = {
        val foundBooks = books.filter(_.title.equalsIgnoreCase(title))
        if (foundBooks.isEmpty) {
            println("No book found with the given title.")
        } else {
            foundBooks.foreach(book => println(s"Found: ${book.title} by ${book.author}, ISBN: ${book.isbn}"))
        }
    }

    def displayBooksByAuthor(author: String): Unit = {
        val booksByAuthor = books.filter(_.author.equalsIgnoreCase(author))
        if (booksByAuthor.isEmpty) {
            println(s"No books found by the author: $author")
        } else {
            println(s"Books by $author:")
            booksByAuthor.foreach(book => println(s"${book.title}, ISBN: ${book.isbn}"))
    }
  
  }

    def main(args: Array[String]): Unit = {

        var continue = true;

    while (continue) {
      println("\nLibrary Management System")
      println("1. Display Library Collection")
      println("2. Add Book")
      println("3. Remove Book")
      println("4. Check if Book is in Library")
      println("5. Search Book by Title")
      println("6. Display Books by Author")
      println("7. Exit")
      print("Choose an option: ")

      readLine() match {
        case "1" => displayLibrary()

        case "2" =>
          print("Enter book title: ")
          val title = readLine()
          print("Enter book author: ")
          val author = readLine()
          print("Enter book ISBN: ")
          val isbn = readLine()
          addBook(Book(title, author, isbn))

        case "3" =>
          print("Enter book ISBN to remove: ")
          val isbn = readLine()
          removeBook(isbn)

        case "4" =>
          print("Enter book ISBN to check: ")
          val isbn = readLine()
          isBookInLibrary(isbn) 
          
        case "5" =>
          print("Enter book title to search: ")
          val title = readLine()
          searchBookByTitle(title)

        case "6" =>
          print("Enter author name to search: ")
          val author = readLine()
          displayBooksByAuthor(author)

        case "7" =>
          continue = false
          println("Exiting the Library Management System.")

        case _ =>
          println("Invalid option. Please try again.")
        
    }}
}

}