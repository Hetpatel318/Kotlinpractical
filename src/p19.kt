fun main(){
    for(i in 1..5 step 2)
        println(i)

        println("using max Function")
        val b1=arrayOf(1,2,3,4,5)
        println(b1.max())

     println("using For loop")
    val a2=arrayOf(15,29,36,45,50)
    var max=a2[0]
    for(num in a2){
        if (num>max){
            max=num
        }
    }
    println(max)
}