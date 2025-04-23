
fun main() {
    val test1:String="123"
    val test2:Int=123
    val test3=123.444
    val test4=2938490234982
    val test5:Float=123.44439402f
    val test6 = Integer.parseInt(test1)

    println(test1::class.java.simpleName)
    println(test2::class.java.simpleName)
    println(test3::class.java.simpleName)
    println(test4::class.java.simpleName)
    println(test5)
    println(test6)
    println(test6::class.java.simpleName)

}