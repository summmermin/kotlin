
fun main() {
    val studentScore=150
    
    // if(studentScore>150){
    //     println("150 초과입니다.")

    // }else{
    //     println("150 안넘음")

    // }

        
    // if(studentScore>=150){
    //     println("150 이상입니다.")

    // }else{
    //     println("150 이하")

    // }

    // if(studentScore<=150){
    //     println("150 이하하입니다.")

    // }else if(studentScore<=200){
    //     println("200 이하하입니다.")

    // }else{
    //     println("나머지")

    // }

    when(studentScore){
        100 -> {
            println("score :::"+studentScore)
        }
        90 -> {
            println("score :::"+studentScore)
        }        
        80 -> {
            println("score :::"+studentScore)
        }
        else ->{
            println("no :::"+studentScore)
        }
    }

}