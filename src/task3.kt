fun main() {
    var mList = mutableListOf("Football", "Baseball", "Basketball")

    println(mList)

    mList = mutableListOf("Football", "Baseball", "Basketball")
    val mMap = mutableMapOf("0" to "Netball")
    val x = 0
    for (item in mList){
        mMap.put(x.toString(), item)
    }
    println(mMap.values)

    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set)

    mList = mutableListOf("Football", "Baseball", "Basketball")
    mList.sort()
    mList.reverse()
    println(mList)
}