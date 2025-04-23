
fun main() {

    // val testList = ArrayList<String>()
    // testList.add("a")
    // testList.add("b")
    // testList.add("c")

    // println("testList:::"+testList)

    val testList = listOf("a","b","c","boy","boucher")

    // val testList = mutableListOf<String>("a","b","c")
    // testList.add("d")
    println("testList:::"+testList)
    val test = testList.filter { it.startsWith("b")} // 띄어쓰기 하는게 권장

    val testListNull = listOf("a","b","c","boy","boucher",null)
    

    println(test)
    println(testListNull.filterNotNull().filter { it.startsWith("b")})

    var ab: String 
    var bc: String = "b"
    ab = bc
    println(ab)

    var iop: String 
    var uio: String? = "d"
    iop = uio!! // null 아님 확신 시에만 사용
    println(iop)

}