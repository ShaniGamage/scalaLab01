object CaesarCipher {
  

  def encryption(text: String, shift: Int): String = {
    text.map {
      case c if c.isLetter => 
        val base = if (c.isUpper) 'A' else 'a'
        
        (((c - base + shift) % 26 + 26) % 26 + base).toChar


      case c => c 
    }
  }

  
  def decryption(text: String, shift: Int): String = {
    encryption(text, -shift)
  }

  

  def main(args: Array[String]): Unit = {
    var text = "Have a Nice day";
    
    println("Plain text : "+ text);

    var encryptedText = encryption(text,3)
    println("Encrypted text : " + encryptedText);
    println("Decrypted text : "+ decryption(encryptedText,3));

  }
}
