fun main() {
    //var is a declaration of variable mutable
    var product: String = "iMac"
    println(product)
    product = "iPhone"
    println(product)

    //Variable typing
    //val is a declaration of variable immutable
    // primitives types Double, Byte, Short, Int, Long, Float, Boolean, integrator = 1_200_000L
    val price: Double = 31.90
    val byte: Byte = 8 // 8-bit
    val short: Short = 16 // 16-bit
    val age: Int = 31 // 32-Bit (99% of process)
    val long: Long = 12313213123131223 // 64-bit
    val integrator: Long = 192L // 32-bit
    val boolean: Boolean = true // 8-bit

    println(price)
    println(age)
    println(product)

    println(price::class)
    println(age::class)
    println(product::class)

    //Typing conversion
    val myPriceDiscount = 22
    val response = myPriceDiscount.toDouble()
    println(response)

    //Logics operators ( + - / * )
    //Concatenating ( + )
    //Boolean ( true or false ) | ( 1 - 0 )
    println (boolean)
    println (!boolean)

    //variable state
    val name = "Cleber Vitorio"
    val lengthName = name.length // accessing the object property of variable
    println(lengthName)
    println(name)

    println("Hello World".length)

    val newInstruction = name.uppercase() // accessing the behavior of a object

    println(newInstruction)

    //Formating text
    //Using /n
    //Using triple quotation marks ( """ )
    val message = "Hello Cleber, \nYour product arrived"

    var newMessage = """
        Hello Cleber,
        Your product arrived.
        Have a nice day!
    """.trimIndent()
    println(message)
    println(newMessage)

    // other example
    val csv = """
         text1,
         text2
    """.replaceIndent(";")
    println(csv)

    val otherName = "Cleber"
    val otherAge  = 57
    val otherPrice = 19.90
    val sumAge = otherAge + 10
    // println("Hello, " + otherName + ", sua idade é " otherAge)
    // println("Hello,  + otherName + ", sua idade é " otherAge)
    println("Hello, $otherName. Your age is $otherAge. Your discount is : $otherPrice ")
    println("Hello, $otherName. Your age is $sumAge. Your discount is : $otherPrice ")
    println("Hello, $otherName. Your age is ${otherAge + 10}. Your discount is : $otherPrice ")
    println("Hello, $otherName. Your age is ${otherAge + 10}. Your discount is : $otherPrice and Your name has ${otherName.length} characters")

    //Conditions
    var otherNewProduct = "iPhone"
    var otherNewProductOne = "iMac"
    var otherNewPrice = 20_000

    // if and else ( Flow Control)
    // ( <, >, <=, >=, !, ==, !=, &&, ||)
    // When I am using the instruction (&&) and first instruction is true, the program is going to process the second
    // When I am using the instruction (||) and first instruction is true, the program is not going to process the second


    //and
    //true  | true  = true
    //true  | false = false
    //false | true  = false
    //false | false = false

    //or
    //true  | true  = true
    //true  | false = true
    //false | true  = true
    //false | false = false

    if (otherNewProduct.length < 3){
        println("You don't should show product names smoller")
    } else {
        println("Product with greater 3 characters")
    }

    if (otherNewPrice > 30_000){
        println("You gained 30% of discount")
    } else if (otherNewPrice > 20_000){
        println("You gained 20% of discount")
    } else if (otherNewPrice > 10_000){
        println("You gained 10% of discount")
    } else {
        println("You didn't gain discount")
    }

// if And
    if (otherNewPrice == 20_000 && otherNewProduct == "iPhone") {
        println("Success")
    } else {
        println("Failure")
    }

// if Or
    if (otherNewPrice == 20_000 || otherNewProduct == "iPhone") {
        println("Success")
    } else {
        println("Failure")
    }

// String compare
    println(otherNewProduct == otherNewProductOne)
    println(otherNewProduct != otherNewProductOne)
    println(otherNewProduct.equals(otherNewProductOne))

// To the variable be null(Nullable) it needs to declare this
    var otherNewProductTwo: String? = "iMac"
    otherNewProductTwo = "iPhone"
    otherNewProductTwo = null

    println(otherNewProductTwo)

    if (otherNewProductTwo != null) {
        val quantityOfCharacters = otherNewProductTwo.length
        println(quantityOfCharacters)
    }

    val quantityOfCharactersOne = otherNewProductTwo?.length
    println(quantityOfCharactersOne)

    val quantityOfCharactersTwo = if (otherNewProductTwo != null) otherNewProductTwo.length else 0
    println(quantityOfCharactersTwo)

    // Elvis Operator ( ?: )
    val quantityOfCharactersThree = otherNewProductTwo?.length ?: 0
    println(quantityOfCharactersThree)

}
