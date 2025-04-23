fun main() {

    // 점수가 50 점 이상인 사람들 출력하기

    val student = mutableMapOf<Int, String>()
    student[99]="오앙"
    student[23]="세롬마니아"
    student[59]="농민"
    student[56]="민장"
    student[77]="진구야"
    student[53]="도라"
    student[64]="에몽"
    student[29]="망치"
    student[49]="상추찜"
    student[19]="돼지"
    student[39]="갈비"

    // for(item in student){
    //    if(item.key>=50){
    //     println(item.value+"는 50점 이상인 사람입니다")
    //    }
    // }
    // 점수가 50 이상이고, 이름이 3글자이상일때

    for(item in student){
        if(item.key>=50 && item.value.length>=3){
            println(item.value+"입니다.")
        }
    }
   }