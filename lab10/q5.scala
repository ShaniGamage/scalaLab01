object Countletter{

def countLetterOccurrences(words:List[String]):Int={
    words.map(_.length()).reduce(_+_)

}

    def main(args: Array[String]): Unit = {
        var words=List("apple","banana","cherry","date");
        var length=countLetterOccurrences(words)
        println("Total count of letter occurrences : " + length)
        
    }
}