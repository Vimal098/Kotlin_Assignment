fun main() {
    var str:String="Tops Technologies"
    var ch = 'T'
    var frequency= 0
    for (i in 0..str.length-1){
        if (ch == str[i]) {
            ++frequency
        }

    }
    println("Frequency of $ch = $frequency")
    }
