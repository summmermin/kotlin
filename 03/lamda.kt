// 람다


fun main() {
    println(a())
    println(b())
    println(sum1(9,6))
    println(sum2(9,6))
    println(sumNull(9,6))
}

val sum1 = {a:Int,b:Int-> a+b}
val sum2 : (Int,Int) -> Int? = {a,b->a+b}
val sumNull : (Int,Int) -> Int? = {_,_->null}


fun a():String {
    return "a test"
}

fun b() = "b test"