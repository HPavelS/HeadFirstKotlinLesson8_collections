fun task1(){
    val numbers = mutableListOf("zero", "two", "four", "six")
    println(numbers)
    if (numbers.contains("zero"))
        numbers.remove("zero")
    numbers.add("eight")
    println(numbers)
    numbers.add("ten")
    println(numbers)
    println(numbers)
}

fun task11() {
    var a = mutableListOf<String>()
    a.add("Zero")
    a.add("Two")
    a.add(2,"Four")
    a.add(3, "Six")
    println(a)
    if (a.contains("Zero")) a.add("Eight")
    a.remove("Zero")
    println(a)
    if (a.indexOf("Four") != 4) a.add("Ten")
    println(a)
    if (a.contains("Zero")) a.add("Twelve")
    println(a)

}