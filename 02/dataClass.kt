// data class
// 이름처럼 데이터를 넣어놓는 클래스

// 서버에서 데이터를 넣어놓은 것을 받아올때

fun main() {
    val justDog=JustDog("삐삐",21)
    val dataDog=DataDog("모모",22)
    println(justDog.age)
    println(justDog.name)
    println(dataDog.toString())

    val dataDog2=dataDog.copy(name="파트라슈 여친")
    println(dataDog2.toString())
}


class JustDog(var name:String,var age:Int)
data class DataDog(var name:String,var age:Int)
