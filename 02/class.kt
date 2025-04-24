// fun 기능
// class 설계+기능, 붕어빵틀

fun main(){
//    println(Test().a)
//    println(Test2("akakak").b)
//    Test3().test3Fun()

//    val info = MyInfo()
//
//    println(info.getMyName())
//    println(info.getMyLocation())
//    println(info.getMyAge())
//
//    val dog =Dog("파트라슈",20)
//    println(dog.getMyDogInfo())

    initTest()
    InitialValue("박보검",25)
    InitialValue("아이유")

}

class InitialValue(name:String,age: Int=35){
    init {
        println(name)
        println(age)
    }
}


class Test{
    val a="avd"
}

class Test2(str:String){
    val b=str
}

class Test3(){

    fun test3Fun(){
        println("test fun3")

    }
}

class initTest(){
    
    init {
        println("여기서 뭔가 해주고파")
    }

    fun testInitFun(){
        println("testInitFun")
    }

}

class Dog(name:String,age:Int){
    val dogName=name
    val dogAge=age

    fun getMyDogInfo():String{
        return "$dogName :: $dogAge"
    }

}

class MyInfo(){
    fun getMyAge():Int{
        return 20
    }

    fun getMyName():String{
        return "summer"
    }

    fun getMyLocation():String{
        return "seoul"
    }
}