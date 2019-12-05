import Constants.Companion.RED

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

    println("Comparing vals and contrast it with java")
    val num2 = 15
    val match = (num1.toInt() == num2)  //    match = (int)num1 == num2;
    println("Match = $match")
    // Unnecessary
    val match2 = num1.toInt().equals(num2) // boolean match2 = Integer.valueOf((int)num1).equals(Integer.valueOf(num2));
    println("Match2 = $match2")
    println("Fun inc() return result. Value before fun $num1")
    // increment inc == ++
    num1.inc()
    println("And after execution, but not assigning value: $num1")
    println("Comparison result = ${num1.toLong().compareTo(num2)}") // var12 = "Comparison result = " + ((var13 = (long)num1 - (long)num2) == 0L ? 0 : (var13 < 0L ? -1 : 1));
    val someString = "Str"
    val anotherStr = String().plus("Str") //String anotherStr = new String() + "Str";
    anotherStr.plus("AnotherAtr") //(new StringBuilder()).append(anotherStr).append("AnotherAtr").toString();
    println(someString == anotherStr) //boolean var9 = Intrinsics.areEqual(someString, anotherStr);
    println(someString.equals(anotherStr)) //var9 = someString.equals(anotherStr);
    println("Constant from companion object $RED")
    println("===========================================")
}