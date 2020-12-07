data class User(var name: String, val age: Int)

val user = User("Tanaya Karmakar", 32)
var updatedUser = user.copy(age = 32)
