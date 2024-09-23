package com.app.hangman

import kotlin.random.Random

val words = listOf("elbow", "writer", "circle", "polish", "bridge", "store", "fang", "scarecrow", "show",
        "jeans", "wilderness", "position", "strength", "face", "farming", "lake","process", "thought", "food",
        "draught")

var word = ""
val guesses = arrayListOf<String>()
var remainingGuesses = 6
var mistakes = 0
fun main(args: Array<String>) {
    setupGame()
}

fun setupGame() {
    val wordIndx = Random.nextInt(words.size)
    word = words[wordIndx].uppercase()
    println(word)

    for(i in word.indices) {
        guesses.add("_")
    }


    var gameOver = false

    do {
        printGameStatus()

        println("Please enter a letter: ")
        var input = readLine()?:""

        if(input.isEmpty()) {
            println("That's not a valid input, please try again")
        } else {
            val letter = input[0].uppercase()
            if(word.contains(letter)) {
                for(i in word.indices) {
                    if(word[i] + "" == letter && guesses[i] == "_") {
                        guesses[i] = letter
                        break
                    }
                }
                if(!guesses.contains("_")) {
                    gameOver = true
                }
                //println(guesses)
            } else {
                println("Sorry, thats not the part of the word")
                remainingGuesses--
                mistakes++
                if(mistakes == 6) {
                    gameOver = true
                }
            }
        }
    } while (!gameOver)

    if(mistakes == 6) {
        printGameStatus()
        println("Sorru, you lost. The word was $word")
    } else {
        println("\n Congratulations, you won !!!")
        println("The word was $word")
    }
}

fun printGameStatus() {
    when(mistakes) {
        0 -> printZeroMistakes()
        1 -> printOneMistake()
        2 -> printTwoMistakes()
        3 -> printThreeMistakes()
        4 -> printFourMistakes()
        5 -> printFiveMistakes()
        6 -> printSixMistakes()
    }

    println("Word: ")
    for(element in guesses) {
        print("$element ")
    }
    println("\n You have $remainingGuesses guess(es) left")
}

fun printZeroMistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun printOneMistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun printTwoMistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun printThreeMistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun printFourMistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\ ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun printFiveMistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\ ")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun printSixMistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\ ")
    println("  |      | ")
    println("  |     / \\ ")
    println(" /|\\      ")
    println("/ | \\     ")
}