fun main(){
    println("Enter Number n1:")
    println("Enter Number n2:")
    var n1 = readln()!!.toInt()
    var n2 = readln()!!.toInt()
    println(add(n1,n2))
    println(subtract(n1,n2))
    println(multi(n1,n2))
    println(div(n1,n2))

}
fun add(n1: Int, n2: Int):Int {
    return n1 + n2
}
fun subtract(n1: Int, n2: Int):Int {
    return n1 - n2
}
fun multi(n1: Int, n2: Int):Int {
    return n1 * n2
}
fun div(n1: Int, n2: Int):Int {
    return n1 / n2
}
