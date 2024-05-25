package com.xkmanabu

class App {
    val greeting: String
        get() {
            return "Hello from kotlinWorld!"
        }
}

fun main() {
    println(App().greeting)
}
