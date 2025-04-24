fun main(){
    println(findStringLength(null))
}

// fun findStringLength(st:String?):Int{
//     var result:Int =0
//     if(st!=null){
//         result = st.length
//     }

//     return result
// }

fun findStringLength(st:String?):Int{
    return st?.length ?:0
}