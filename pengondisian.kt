fun main(){
    val i  =2
    if (i>1){
        println("benar")
    }
    else{
        println("salah")
    }
    val nama = "ramdon"
    if (nama=="rizky"){
        println("jika kamu = " +nama+" maka kamu rizky")
    }
    else{
        println("jika kamu = "+nama+" maka kamu bukan rizky")
    }
    val b=true
    if (b==false){
        println("b adalah salah")
    }
    else{
        println("b adalah benar")
    }
    //pengondisian when
    val nilai='b'
    when(nilai){
        'a' -> println("ajeng")
        'b' -> println("babi")
            'c'-> println("cebol")
        'd'-> println("didi")
        'e' -> println("eeek")

    }
}