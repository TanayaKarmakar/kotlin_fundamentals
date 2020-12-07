fun main(args: Array<String>) {
    var ans: Int = getData(10,20,30)

    println("Result : ${ans}")

    var multiply = {num1: Int, num2: Int -> num1 * num2}

    println("15*6 ${multiply(15, 6)}")

    var n: Int = Integer.parseInt(readLine())
    var ans1: Int = fact(n)

    println("Result of factorial is ${ans1}")
}

fun getData(vararg result: Int): Int {
    var sub = 0
    result.forEach { i -> sub += i }
    return sub
}

//tail recursion
fun fact(x: Int): Int {
    tailrec fun factorial(a: Int, b: Int): Int {
        if(a == 0)
            return b
        return factorial(a - 1, a * b)
    }
    return factorial(x, 1)
}