fun main() {

    //Map
    // 5 철수
    // 10 유리
    // 14 짱구

    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(10,"유리")
    testMap1.put(5,"철수")
    testMap1.put(14,"짱구")
    

    println(testMap1)
    println(testMap1[14])


    val testMap2 =  mutableMapOf<Int, String>()
    testMap2[33]="나나"
    testMap2[22]="도나"
    testMap2[23]="바바"
    testMap2[54]="아아"

    for(i in testMap2){
        println("i는 $i")
    }


    //Set
    //중복방지

    val testSet1 = mutableSetOf("a","b","c")
    testSet1.add("e")
    testSet1.add("e")
    testSet1.add("e")
    testSet1.add("e")
    testSet1.add("e")
    testSet1.remove("e")
    println(testSet1)


    //iterator

    val testList3 = mutableListOf("a","b","c")
    val testIterator = testList3.listIterator()

    // println(testIterator.next())
    // println(testIterator.next())
    // println(testIterator.next())
    // println(testIterator.hasNext())
    // println(testIterator.previous())
    // println(testIterator.previous())
    // println(testIterator.previous())

    while(testIterator.hasNext()){
        println(testIterator.next())
    }

   }