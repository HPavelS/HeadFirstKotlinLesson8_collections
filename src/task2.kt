fun main(args: Array<String>) {

    val a = Duck()
    val b = a
    val set = setOf(Duck(), Duck(17))
    println(set)

    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val pets = mutableSetOf<String>()
    pets.addAll(petsEmily + petsLiam + petsSophia + petsNoah)
    println(pets)

    val pets2 = mutableListOf<String>()
    pets2.addAll(petsEmily + petsLiam + petsSophia + petsNoah)
    println("Колличество животных = " + pets2.size)

    println("Колличество разных животных = ${pets.size}")

    val pets3 = pets.toMutableList()
    pets3.sort()

    println(pets3)
}

class Duck(val size: Int = 17) {
    override fun equals(other: Any?): Boolean {
        if (this === other){
            return true

        }
        else
        if (other is Duck && size == other.size) {
            return true
        }

        return false

    }
    override fun hashCode(): Int {
        return size
    }
}

