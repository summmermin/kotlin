// 오버로딩
// 같은 이름의 메서드를 여러개 가지면서, 매개변수의 유형과 갯수가 다르도록 하는 어쩌고 저쩌고
// over + loading
// 겹겹히 쌓는다?

fun main(){
    val c = Calculator()
    c.sumNumber(2,3)
    c.sumNumber("나는","행복")
    c.sumNumber(2,3,4)
}

class Calculator(){

    fun sumNumber(a:Int,b:Int){
        println(a+b)
    }
    fun sumNumber(a:Int,b:Int,c:Int){
        println(a+b+c)
    }

    fun sumNumber(a:String,b:String){
        println(a+b)
    }
}