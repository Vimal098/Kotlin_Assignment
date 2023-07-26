fun main() {
    println("Enter The Number :")
    var num:Int= readln().toInt()
    println("********* ODD NUMBERS ***********")
    for (i in 1..num){
        if (i%2==1){
            println(i)
        }
    }
    println("********* EVEN NUMBERS **********")
    for (i in 2..num){
        if (i%2==0){
            println(i)
        }
    }
}