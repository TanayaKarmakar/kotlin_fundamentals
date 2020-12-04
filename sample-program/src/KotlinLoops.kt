fun main(args: Array<String>) {
    //for loop
    for(i in 1..5) {
        println(i)
    }

    //while loop
    var i: Int = 0
    while(i < 4) {
        println("While loop: The value of i is ${i}")
        i++
    }

    //do-while loop
    i = 0;
    do {
        println("Do-While loop: The value of i is ${i}")
        i++
    } while(i < 5)
}