fun main() {

    // Variables
    val aValue : Int = 10
    var aVariable : String = "ABC"
    println(aValue)
    println(aVariable)

    aVariable =  "CDE"
    println(aVariable)

    // Number Type
    val integerValue = 42
    val doubleValue = 3.14
    val longLiteral = 1_000_000L
    val float = 123.45F

    println(float)
    println(doubleValue)

    // Type conversion
    val l2 = integerValue.toLong()
    println(longLiteral)
    println(l2)

    println()

    // other numeral systems
    val hexBytes = 0xA4_D6_FE_FE
    println(hexBytes)
    val bytes = 0b01010010_01101101_11101000_10010010 // binary numeric system
    println(bytes)
}