// 인터페이스

// 추상클래스랑 비슷해요
// 꼭 채워넣어야하는 붕어빵 틀인데
// 이거 자체가 작은 틀이라서 다른 틀에 여러개 넣을 수 있음

fun main(){
    BMW().engine()
    BMW().wheel()
    BMW().autoDrive()
    Ben().autoPark()
}

interface CarAutoDrive{
    fun autoDrive()
}

interface CarAutoPark{
    fun autoPark()
}

abstract class Car{
    abstract fun wheel()
    abstract fun engine()
}

class BMW:Car(),CarAutoDrive{
    // 꼭 상속 받는 곳에서 꽉 채워줘야해
    override fun engine() {
        println("bmw 시동 켜짐")
    }

    override fun wheel() {
        println("bmw 굴러가요")
    }
    
    override fun autoDrive(){
        println("자율 주행이 됩니다")
    }
}


class Ben:Car(),CarAutoPark{
    // 꼭 상속 받는 곳에서 꽉 채워줘야해
    override fun engine() {
        println("Ben 시동 켜짐")
    }

    override fun wheel() {
        println("Ben 굴러가요")
    }

    override fun autoPark() {
        println("Ben 자동 주차")
    }
}