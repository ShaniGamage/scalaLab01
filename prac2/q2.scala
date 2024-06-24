object demo{

    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f;
    var g=4.0f;


    def main(args: Array[String]): Unit = {
        //a
        b-=1;
        println(b * a + c *d );
        d-=1

        //b
        println(a);
        a+=1

        //c
        println ((-2)*(g-k)+c );

        //d
        println(c)
        c+=1;

        //e
        c+=1;
        println(c*a)
        a+=1

        
    }
}