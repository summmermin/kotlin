//let with run apply also
//let : none null 일때 사용
//with : 컨텍스트 내부에서 함수를 호출
//run : 객체 초기화와 return 값 계산에 필요할 때 주로 사용
//apply : 겂울 번환하지 않고 객체 구성에 대해 주로 사용
//also : 객체에 대해 추가적인 작업

fun main() {
//    val str:String?="hi"
//
//    //let
//    val strLegth = str?.let {
//        println(it)
//        it.length
//    }
//    println(strLegth)
//
//
//    val str2:String?=null
//
//    val str2Legth = str2?.let {
//        println(it)
//        it.length
//    }
//    println(str2Legth)

    //with
    val numbers = mutableListOf("a","b","c","d")
//    println(numbers.first())
//    println(numbers.last())

    val firstAndLast = with(numbers){
        "${first()} ${last()}"
    }

    println(firstAndLast)

    //run:설정도 하고 무언가 가공된 결과가 필요할 때
    //반환값	람다의 마지막 표현식 결과값

    val service =mutiPortService("www.naver.com",80)
    val result = service.query(service.prepareReq() + " to port ${service.port}")

    val result2 = service.run {
        port =8080
        query(prepareReq() + " to port ${service.port}") // << 이게 마지막 표현식
    }

    println(result)
    println(result2)


    //apply :객체 설정만 하고 그 객체 자체가 필요할 때
    //반환값	객체 자신
    val tester1 =Person("teter1")
    println(tester1)
    tester1.age=20
    tester1.city="seongnam"
    println(tester1)

    val test2 =Person("teter2").apply{
        age=21
        city="busan"
    }

    println(test2)

    //also
    val numbersList2 = mutableListOf<Int>(1,2,3,4)
    println("$numbersList2 여기에서 5를 추가합니다.")
    numbersList2.add(5)
    println(numbersList2)

    val numbersList3 = mutableListOf<Int>(1,2,3,4)
    numbersList3.also {
        println("$numbersList3 여기에서 5를 다시 한번 추가해볼까요")
    }.add(5)
    println(numbersList3+"<<<<numbersList3")
}

data class Person(
    var name:String,
    var age:Int=0,
    var city:String="",
)

class mutiPortService(val url:String,var port:Int){
    fun prepareReq():String = "기본 요청 url ${url}"
    fun query(req:String) = "결과 query ${req}"
}