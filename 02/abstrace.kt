//추상클래스

//class 붕어빵 틀
//추상클래스 기존에는 비어있고
//꽉채워서 붕어빵을 만들어야하는 틀

fun main(){
//    Bike().engine()
//    Bike().wheel()
    BMW().engine()
    BMW().wheel()
    Ben().engine()
    Ben().wheel()
}
//open class Car{
//
//    open fun wheel(){
//        println("굴러갑니다")
//    }
//
//
//    open fun engine(){
//        println("시동이 켜졌습니다")
//    }
//}
//
//class Bike():Car(){
//    override fun wheel() {
////        super.wheel()
//        println("자전거 휠이 굴러가요")
//    }
//}

abstract class Car{
    abstract fun wheel()
    abstract fun engine()
}

class BMW:Car(){
// 꼭 상속 받는 곳에서 꽉 채워줘야해
    override fun engine() {
        println("bmw 시동 켜짐")
    }

    override fun wheel() {
        println("bmw 굴러가요")
    }
}


class Ben:Car(){
    // 꼭 상속 받는 곳에서 꽉 채워줘야해
    override fun engine() {
        println("Ben 시동 켜짐")
    }

    override fun wheel() {
        println("Ben 굴러가요")
    }
}