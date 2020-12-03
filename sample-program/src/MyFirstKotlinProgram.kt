fun main(args: Array<String>) {
    println("Hello World")
    var obj = Kotlin()
    obj.name = "Tanaya Karmakar"
    println("The given name is " + obj.name)
    println("The given name is ${obj.name}")

    printNumbers()
    printCharacter()
    printBoolean()
}

fun printNumbers() {
    val a: Int = 10
    val d: Double = 10.00
    val f: Float = 100.00f
    val l: Long = 1000000005
    val s: Short = 24
    val b: Byte = 2
    println("The value of integer is ${a}")
    println("The value of double is ${d}")
    println("The value of float is ${f}")
    println("The value of long is ${l}")
    println("The value of short is ${s}")
    println("The value of byte is ${b}")
}

fun printCharacter() {
    var write: Char = 'T'
    println("The value of the character is ${write}")
}

fun printBoolean() {
    var isChecked: Boolean
    isChecked = true
    println("The value of the boolean is ${isChecked}")
}