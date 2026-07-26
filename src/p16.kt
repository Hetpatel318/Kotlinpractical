fun main(){
    println("Enter Number n1:")
    println("Enter Number n2:")
    var number1 = readln()!!.toInt()
    var number2 = readln()!!.toInt()
    println("Addition of $number1, $number2 is ${add(number1, number2)}")
    println("Subtraction of $number1, $number2 is ${subtract(number1, number2)}")
    println("Multiplication of $number1, $number2 is ${multiply(n1=number1, n2=number2)}")
    println("Division of $number1, $number2 is ${divide(n1=number1, n2=number2)}")

}
fun add(n1: Int, n2: Int):Int {
    return n1 + n2
}
fun subtract(n1: Int, n2: Int):Int {
    return n1 - n2
}
fun multiply(n1: Int, n2: Int):Int {
    return n1 * n2
}
fun divide(n1: Int, n2: Int):Int {
    return n1 / n2
}
