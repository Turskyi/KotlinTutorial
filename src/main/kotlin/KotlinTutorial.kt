fun main() {
    printBasicTypes()
    executeArithmeticOperators()
    executeForLoops()
    executeWhileLoop()
    executeVararg()
    printObjects()
}

private fun printObjects() {
    val user1 = User("   Hans   ", 30)
    val user2 = User("  Elfriede   ", 60)
    val user3 = User(age = 60)
    val user4 = User("    ", 20)
}

class User(name: String = "No Name", var age: Int) {
    init {
        print("New user created. Age: $age,")
    }
    val name: String
    init {
        if (name.isBlank()) {
            this.name = "No Name"
        } else {
            this.name = name.trim()
        }
        println(" Name: ${this.name}")
    }
}

private fun executeVararg() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)
    println(getSum(10, 20, *array, 30, b = 40))
}

fun getSum(a: Int, vararg numbers: Int, b: Int): Int {
    var sum = a + b
    for (number in numbers) sum += number
    return sum
}

private fun executeWhileLoop() {
    var i = 0
    outer@ do {
        println(i)
        i++
        //continue
        var j = 0
        while (j < 5) {
            println("---$j")
            j++
            break@outer
            println("I'm not printed")
        }
        println("I'm printed")
    } while (i < 5)
}

private fun executeForLoops() {
    val names = arrayOf("Jim", "John", "Jenny", "Jamie")
    for (name in names) println(name)
    //for (i in 1..10) println(i)
    //for (i in 1 until 10) println(i)
    //for (i in 10L downTo 1) println(i)
    /* skips every second letter in alphabet */
    for (i in 'a'..'z' step 2) println(i)
}

private fun executeArithmeticOperators() {
    var a = 5
    val b = 3.0
    println("a = " + a + " b = " + b)
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a($a) % b($b) = ${a % b}")
    println("(2 + 2) * 3 = ${(2 + 2) * 3}")
    println("-a = ${-a}")
    a += 2
    println("a += 2: $a")
    println("a++: ${a++}")
    println("++a: ${++a}")
    a -= 2
    println("a -= 2: $a")
    println("a--: ${a--}")
    println("--a: ${--a}")
    a *= 2
    println("a *= 2: $a")
    a /= 2
    println("a /= 2: $a")
    a %= 2
    println("a %= 2: $a")
}

private fun printBasicTypes() {
    val exampleString = "\"Florian\nWalther\""
    val exampleRawString = """ "Florian
Walther" """.trimMargin()
    print(exampleRawString)
    val exampleNumber: Double
    exampleNumber = 2_000_000.12
    val exampleLong: Long = exampleNumber.toLong()
    val exampleChar = '?'
    val exampleInt: Int = exampleChar.toInt()
    val exampleBoolean = false
}