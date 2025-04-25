// infix function


fun main() {
    println(10 sum1 40)
    println("안녕" sumSt1 "반가워요")
    println(10 showList 30)
}

infix fun Int.sum1(num: Int):Int=this+num
infix fun String.sumSt1(qwe: String):String=this+qwe
infix fun Int.showList(num: Int):List<Int>{
    val list = mutableListOf<Int>()
    for (i in this..num){
        list.add(i)
    }
    println(this)
    return list
}