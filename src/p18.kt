fun main(){
    val a1=arrayOf('a','b','c','d')
    println(a1.joinToString())
    val a2= Array<Int>(5){10}
    println(a2.joinToString())
    val a3= Array<Int>(5){i->i * 2}
    println(a3.joinToString())
    a3.shuffle()
    println(a3.joinToString())
    a3.sort()
    println(a3.joinToString())
}