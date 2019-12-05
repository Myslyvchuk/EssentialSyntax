fun main(args: Array<String>) {
    println("Print value passed in args: " + args[0])
    println("Print value passed in args getting it by $ {} operator: ${args[1]}")
    println("===========================================")

    val myName = "Bohdan"
    var num1 = 45.0
    println("Default value type of num1 is ${num1::class.qualifiedName} and type myName is ${myName::class.qualifiedName}")
    num1++
    println("To change type use .toFloat() or toOther_Type_Method(). Now type of num1 is ${num1.toLong()::class.qualifiedName}")
    println("===========================================")

}