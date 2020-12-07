fun main(args: Array<String>) {
    val sum = {x: Int, y: Int -> x + y}
    val ans = sum(15, 6)

    println("The sum is ${ans}")

    val myLambda: (Int) -> Unit = {p: Int -> println(p)}
    multiply(9, 5, myLambda)
}

fun multiply(x: Int, y: Int, myLambda: (Int) -> Unit) {
    var multiply = (x * y)
    myLambda(multiply)
}