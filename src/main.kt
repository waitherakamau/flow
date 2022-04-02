fun main(){
    nambari()
    println(jina(arrayOf("maxwel","oletayuni","joy","waithera","tracy")))
    robot(2)
    robot(13)
    robot(22)
    zeze()


}

fun nambari(){
    for (bari in 1..100){
        if (bari%2!==0){
            println(bari)

        }
    }
}
fun jina(names:Array<String>):Int{
    var sese=0
    names.forEach { m->
        if (m.length>5){
            sese++
        }
    }
    return sese

}
fun robot(age :Int){
    if (age<=6) {
        println("a glass of milk")
    }
        else if (age>6 && age <=15) {
        println("fanta")
    }
            else{
                println("cocacola")
            }
        }
fun zeze(){
    for (vec in 1..100){
        if (vec%3==0){
            println("Fizz")

        }
        if (vec%5==0){
            println("Buzz")
        }
        else if(vec%3==0 && vec%5==0){

        }
        println("FizzBuzz")

    }
}




