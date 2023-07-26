fun main() {
    println("Enter the Dividend Value : ")
    var Dividend = readln().toInt()
    println("Enter the Divisor :")
    var Divisor= readln().toInt()
    var Quotient = Dividend / Divisor
    var Remainder = Dividend % Divisor

    println("Quotient = $Quotient")
    println("Remainder = $Remainder")
}
