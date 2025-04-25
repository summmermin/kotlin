// obj -> 싱글톤 패턴 -> 디자인 패턴 중 하나인데
// 디자인 패턴 -> 코드를 어떻게 짜는게 더 좋고, 어떤 방식으로 구성해야 유지보수가 쉬운가
// 객체를 한개만 생성하도록 한다

// obj
// 전역으로 생성되서, 어디서든 접근하여 수정 가능


fun main() {
//    TestObj
//    TestObj
//    val test1= TestClass()
//    val test2= TestClass()
//
//
//    test1.count=10
//
//    println(test2.count)
//    println(test1.count)

    var test3 = TestObjClass()
    var test4 = TestObjClass()

    test3.plusBtn()
    println(TestObjClass.number)
    test3.plusBtn()
    println(TestObjClass.number)
    test4.minusBtn()
    println(TestObjClass.number)

}

class TestObjClass{
    companion object{
        var number = 0
    }

    fun plusBtn() {
        number++
    }

    fun minusBtn() {
        number--
    }
}

object TestObj{
    init {
        println("테 오")
    }

    var count=33
}

class TestClass(){
    init {
        println("테 클")
    }

    var count =0
}

