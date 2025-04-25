// 고차함수


fun main() {
//    println(testSum(1,2))
//    sum1(2,3,{x:Int,y:Int->x+y})
//    sum1(4,4) {x:Int,y:Int->x+y}

    highPrint(::printTest)


}

val testSum= {a:Int,b:Int ->a+b}

fun sum1(a:Int,b:Int,operation:(Int,Int)->Int){
    println("$a $b")
    println(operation(a,b))
}

fun printTest(str:String){
    println(str)
}

fun highPrint(abd:(String)->Unit) {

    abd("ghjk")

}


fun test1():Unit {

    println("아무것도 리턴하지 않는다 Unit")

}

fun test2():Unit {

    println("아무것도 리턴하지 않는다 Unit")

    return
}

fun test3():Unit {

    println("아무것도 리턴하지 않는다 Unit")

    return Unit
}