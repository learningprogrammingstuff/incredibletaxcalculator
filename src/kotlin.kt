import kotlin.times

fun main() {
    println("Hi welcome to awesome program. Today we will be learning Taxes!!!!!")
    Thread.sleep(1_000)
    println("What's your name?")
    val userInput = readln()
    println("Hello, $userInput")
    println("what is your tax (more specially incoem)??? (yearly))")
    val annualIncome = readln().toDouble()
    println("what's the tax rates?")
    val taxRatePercent = readln().toDouble()
    println("So, you make $annualIncome per year and the taxes are $taxRatePercent.")
    val taxRate = taxRatePercent / 100
    val taxOwed = annualIncome * taxRate
    println("You owe $taxOwed in taxes this year. Have fun!!!!!!!!!!!!!!")
}

