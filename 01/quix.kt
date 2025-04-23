
fun main() {
// 퀴즈
// 간단한 조건문 이용 문제풀이
// 학생의 A B C D F 점수를 출력
val score =85
// 학생 점수 
// 100 이상 A
// 90 이상 B
// 80 이상 C
// 70 이상 D
// 60 이상 F

if(score>=100){
    println("A :::"+score)
}else if(score>=90){
    println("B :::"+score)
}else if(score>=80){
    println("C :::"+score)
}else if(score>=70){
    println("D :::"+score)
}else{
    println("F :::"+score)
}

}