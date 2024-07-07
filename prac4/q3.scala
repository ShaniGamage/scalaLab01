object stringFormat{

    //toUpper function
    def toUpper(name:String):String=name.toUpperCase();

    //toLower function
    def toLower(name:String):String=name.toLowerCase();

    //format the name using provided function
    def formatName(name:String)(formatFunc : String=>String):String=formatFunc(name);

    def main(args: Array[String]): Unit = {
        var names=Array("Benny","Niroshan","Saman","Kumara");

        var formattedName=names.map{
            case "Benny" => formatName("Benny")(toUpper);
            case "Niroshan" => formatName("Niroshan"){name => toUpper(name.substring(0,2))+(name.substring(2,8))}
            case "Saman" => formatName("Saman")(toLower);
            case "Kumara" => formatName("Kumara"){name=>toUpper(name.substring(0,1))+toLower(name.substring(1,5))+toUpper(name.substring(5,6))}
        }

        formattedName.foreach(println);
        
    }
}