fun main(args: Array<String>) {
    for (i in 1..100 step 2){
        if(i <= 50){
            below50(i)
        } else{
            above50(i)
        }
    }
}

fun below50(number: Int){
    println("Below 50: $number")
}

fun above50(number: Int){
    println("Above 50: $number")
}