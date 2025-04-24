// 상속
// 오버라이딩
// 부모클래스의 메서드를 자식클래스에서 재정의해서 사용할 수 있고~

// 처음 클래스 설명할 때 붕어빵 틀~

fun main(){
//    Parents()
//    Child()
    Child().disease()
}

open class Parents(){
//    init {
//        println("이것은 부모입니다")
//    }

    fun doing(){
        println("자식을 돌롭니다.")
    }
    
    open fun disease(){
        println("비염있어요")
    }
}


class Child():Parents(){
    init {
        println("이것은 자식입니다")
    }

    override fun disease() {
//        super.disease()
        println("저는 겁이 없어요")
    }
}