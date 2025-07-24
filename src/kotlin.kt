import kotlin.times

fun main() {
    println("Hi welcome to awesome program. Today we will be learning Taxes!!!!!")
    println("DISCLAIMER: THIS IS NOT TURBOTAX")
    println("DISCLAIMER: THIS IS NOT TURBOTAX")
    println("DISCLAIMER: THIS IS NOT TURBOTAX")
    println("DISCLAIMER: THIS IS NOT TURBOTAX")
    Thread.sleep(1_000)
    println("DISCLAIMER: THIS IS NOT TURBOTAX")
    println("DISCLAIMER: THIS IS NOT TURBOTAX")
    println("DISCLAIMER: THIS IS NOT TURBOTAX")
    Thread.sleep(1_000)
    println("What's your name?")
    val userInput = readln()
    println("Hello, $userInput")
    println("What's your annual income")
    val annualIncome = readln().toDouble()
    println("What's your tax rate in percent?")
    val taxRatePercent = readln().toDouble()
    println("So, you make $$annualIncome per year and the tax rates are $taxRatePercent%.")
    val taxRate = taxRatePercent / 100
    val taxOwed = annualIncome * taxRate
    println("You owe $$taxOwed in taxes this year. Have fun!!!!!!!!!!!!!!")
}

