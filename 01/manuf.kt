fun main(){
    // val testString = "동해물과 백두산이 마르고 닳"
    // println(testString.substring(1,3))
    // val newTestString = testString.split(" ")
    // val replaceSt = testString.replace("백두산","설악산")

    // println(newTestString)
    // println(replaceSt)
    val testList = ArrayList<String>()
    testList.add("summeer@naver.com")
    testList.add("sdf@naver.com")
    testList.add("gdfg@google.com")
    testList.add("sumaweqmeer4@naver.com")
    testList.add("sdf@hanmail.com")
    var num:Int=0

    // naver 이메일 쓰는 사람 찾기

    for(item in testList){
        val replText = item.split("@")
        // println(replText)
        println(item)

        if(replText[1] == "naver.com"){
            num++
        }
    }
    println(num)


}