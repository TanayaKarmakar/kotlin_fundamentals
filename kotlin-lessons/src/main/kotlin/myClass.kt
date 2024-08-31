fun main() {
    var person1 = Person("ABC", 16);
    person1.canVote()

    var person2 = Person("DEF", 23)
    person2.canVote()
}


class Person(var name: String, var age: Int) {
    init {
       // println("Person Information")
        println("****************")
        println("Name = ${name}")
        println("Age = ${age}")
        println("****************")
    }
    fun canVote() {
        if(age < 18) {
            println("$name can't vote")
        } else {
            println("$name can vote")
        }
    }
}

