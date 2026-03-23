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

    helloWorld()

    val responseNumber = sumNumber() //call function

    // return responseNumber of function

    println(responseNumber)

    val responseNumber1 = sumNumber1() //call function

    // without return responseNumber1

    print(responseNumber1)

    // Calling function into the function

    helloWorld1()

    helloWorld2()

    verifyAge(16)

// function with arguments
    verifyUser(18, "Bruce", isAdmin = false)
    verifyUser(14, "James", isAdmin = true)
    verifyUser(24, "William",true)

// function - high load of function
    verifyLogin(18, "Bruce", isAdmin = false)
    verifyLogin(14, "James", isAdmin = true)
    verifyLogin(24, "William")

// function - high load of function
    registerUser(18, "Bruce")
    registerUser(22, "William", true)
    registerUser(26)
    registerUser(30, "David", false)

//    val resultSum = sumUser(26, 35)
    val resultMultiply = multiplyUser(30.45, 45.73)

    println("The result of sum is: ${sumUser(26, 35)}")
    println("The result of multiply is $resultMultiply")

}

// functions - code blocks reusable | optimizer |
// Structure - declaration | body | parameter
fun helloWorld(){
    println("Hello")
    println("World")
    println(2 + 3)
}

//Function with return result
fun sumNumber(): Int {
    return 2 + 3
}

//Function without return result (double, string, long, int, etc)
fun sumNumber1(): Unit {
    val responseNumber1 = 2 + 3
    println("I am doing one operation with the number 2 and the number 3 is: $responseNumber1")
}

// Scope of function - Function into the function
fun helloWorld1(){
    println("Hello World")
    fun substraction1() {
       println(2 + 4)
    }
}

// Scope of function - body in line
fun helloWorld2() = println("Hello World")

fun verifyAge(age: Int) {
    if (age > 18) {
        println("it can conduct")
    } else {
        println("it cannot conduct")
    }
}
// fun verifyAge - This function is equal the function above.
// (age: Int) = if (age > 18) println("it can conduct") else println("it cannot conduct")

//Named Parameters
fun verifyUser(ageUser: Int, nameUser: String, isAdmin: Boolean) {
    println("my age is $ageUser and my name is $nameUser, and I am admin: $isAdmin")
    if (ageUser > 18) {
        println("it can conduct")
    } else {
        println("it cannot conduct")
    }
}

//High Load of function or High Load of Method
fun verifyLogin(ageUser: Int, nameUser: String, isAdmin: Boolean) {
    println("my age is $ageUser and my name is $nameUser, and I am admin: $isAdmin")
}

fun verifyLogin(ageUser: Int, nameUser: String) {
    println("my age is $ageUser and my name is $nameUser")
}

fun registerUser(ageUser: Int, nameUser: String = "Unknown", isAdmin: Boolean = false) {
    println("Register of user with age is $ageUser, name: $nameUser and admin: $isAdmin")
}

fun sumUser(x: Int, y: Int) : Int {
    return x + y
}

fun multiplyUser(x: Double, y: Double) : Double {
    return x * y
}
