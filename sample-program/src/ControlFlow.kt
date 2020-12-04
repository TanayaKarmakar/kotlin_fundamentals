fun main(args: Array<String>) {
    var num1: Int = 10
    var num2: Int = 20
    var result: Int = 0

    if(num1 > num2) {
        println(num1)
    }

    var x: Int = 5
    when(x) {
        0,1-> println("x === 0 or x === 1")
        else -> println("Otherwise")
    }
}