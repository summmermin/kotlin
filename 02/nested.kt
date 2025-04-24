// 중첩 클래스
// 내부 클래스

// 중첩 클래스 -> 객체 지향 / 캡슐화
// 내부 클래스 -> RecyclerView

fun main() {
    val test1 = Test1.TestNestedClass()
    test1.testFun1()


    val test2 = Test1.TestNested2Class()
    test2.testFun2()

}

class Test1{

//    val text1 = "test!"

    class TestNestedClass{

        fun testFun1() {
            println("testFun1")
//            println(text1) 그냥 클래스에서는 가져와서 못씀
        }
        
    }
}
class Test2{
    val text1 = "test!"

    inner class Test2NestedClass{

        fun testFun2() {
            println("testFun2")
            println(text1) // 내부 클래스에는 가능
        }

    }
}