fun main(args: Array<String>){
    val names = arrayOf("felix","anton","lion")
    for (i in names){
println(i)
    }
    for (j in 10 downTo 1 step 2){
        println(j)
    }
    //while
    var a = 0
    while(a<10){
    println("white loops")
    a++
    }
    //selama a kurang dari 10 maka akan di print white loops
    var b = 3
    while(b in 1..5){
        println()
    }

}
