// 상속
// 물려받는다

fun main(){
    Job3()


}


open class AllJob(){

    init {
        println("일을 합니다")
    }
}

class Job(){
    
    init {
        println("일을 합니다")
        println("코딩해요")
    }
}


class Job2(){

    init {
        println("일을 합니다")
        println("디자인해요")
    }
}

class Job3():AllJob(){

    init {
        println("마케팅해요")
    }
}

class Job4():AllJob(){

    init {
        println("달리기해요")
    }
}