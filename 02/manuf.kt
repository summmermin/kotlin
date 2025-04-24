fun main(){
    // val testList =mutableListOf<Int>()
    // testList.add(1)
    // testList.add(2)
    // testList.add(3)
    // testList.add(563)
    // testList.add(33)
    // testList.add(32)
    // testList.add(55)
    // testList.add(33)

    // println(testList.distinct()) // 중복제거
    // println(testList.maxOrNull()) // 최댓값
    // println(testList.minOrNull()) // 최솟값
    // println(testList.average()) // 평균값


    // val testList = listOf("민정","민주","희망","소망","민영")
    // val result = testList.filter {
    //     it.startsWith("민")
    // }


    // val testList = listOf(1,2,3,4,5,6,7,8)

    // val result = testList.filter {
    //     it % 2 == 0 
    // }


    val testList = listOf("aa","ssss","aaa","dddddddddd")

    val result = testList.filter {
        it.length >=4
    }

    println(result)
}