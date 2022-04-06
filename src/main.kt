fun main() {
    numeral()
    println( myWords(arrayOf("Misky","Tanya","Happiness","Jane","Bakhita")))
    roboDrinks(2)
    roboDrinks(11)
    roboDrinks(25)

    digit()
}
fun numeral() {
    for (number in 1..100) {
        if (number % 2 !== 0) {
            println(number)
        }
    }
}


fun myWords(names:Array<String>):Int{
    var count=0
    names.forEach{m->
        if (m.length>5){
            count++
        }
    }
    return count
}

fun roboDrinks(age:Int){
    if (age<=6){
        println("glass of milk")
    }
    else if(age>6 && age<15){
        println("Fanta Orange")
    }
    else{
        println("CocaCola")
    }
}

fun digit() {
    for (y in 1..100) {
        if (y % 3 == 0) {
            println("Fizz")
        } else if (y % 5 == 0) {
            println("Buzz")
        }
        if(y%3==0 && y%5==0){
            println("FizzBuzz")

        }
    }
}