fun main(args: Array<String>) {
    val multiply: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    println("5*10 = ${multiply(5, 10)}")
}

