// 제네릭
// 컴파일 시 타입 체크 할 수 있다 -> 컴퓨터가 코드 읽으면서 체크
// 타입 캐스팅이 필요없다


fun main() {

    println(Box1("안녕").value)
    println(Box1(34).value)


    test1("하이")
    test1(789798798)
    test2(789798798)
    test2("하2")
}

class Box1<T>(test:T){
    var value = test

}


fun <T> test1(a:T) {

    println(a)

}


fun <A> test2(a:A) { //범용적으로는 T 라고 씀

    println(a)

}