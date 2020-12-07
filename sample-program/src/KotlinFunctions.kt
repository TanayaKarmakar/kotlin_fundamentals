fun main(args: Array<String>) {
    println("The sum is ${sum(4, 8)}")
    println("The sum1 is ${sum1(10,20)}")
    size(30, 40)
    println("Subtract : ${subtract(14, 6)}")

    val (three, four) = twoFunc(2)

    println("${three}, ${four}")

}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}

fun sum1(a: Int, b: Int): Int = a + b

fun size(c: Int, d: Int) {
    if(c > d) {
        println(d)
    } else {
        println(c)
    }
}
fun subtract(a: Int, b: Int): Int = a - b

fun twoFunc(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}