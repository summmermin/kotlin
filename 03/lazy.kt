//지연 초기화

fun main() {


    //lateinit
    //왜 쓰냐
    // 만약 서버에서 데이터를 받아오는 일이 있을까
    // 서버에서 값을 받아와서 넣어줄 때 씀
    lateinit var lateString: String
//    println(lateString) 여기에서는 에러, 값 안들어갔을때 쓰면 에러남
    lateString = "변경된 스트링 m"
    lateString = "변경된 스트링 n" // 값 변경가능
    println(lateString)



    //lazy
    val lazyString:String by lazy{ // 값 변경 불가능
        println("이 친구가 만들어질 때 프린트")
        "lazyString"
    }

    println(lazyString) // lazyString을 사용하기 전까지는 값이 들어가지 않음
}