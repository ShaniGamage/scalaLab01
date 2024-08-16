object FormatString {

  
  var uppercase: String => String = output => output.toUpperCase()
  var lowercase: String => String = output => output.toLowerCase()
  
  var formatName: String => String = output => output match {
    case "Benny" => uppercase(output)
    case "Niroshan" => output.substring(0, 2).toUpperCase + output.substring(2).toLowerCase
    case "Saman" => lowercase(output)
    case "Kumara" => output.substring(0, 1).toUpperCase + output.substring(1, 5).toLowerCase + output.substring(5).toUpperCase
    case _ => output 
  }

  def main(args: Array[String]): Unit = {
    
    println(formatName("Benny"))    
    println(formatName("Niroshan")) 
    println(formatName("Saman"))    
    println(formatName("Kumara"))       
  }
}
