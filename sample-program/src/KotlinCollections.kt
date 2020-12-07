fun main(args: Array<String>) {
    listDemo()
    setDemo()
    mapDemo()
}

fun mapDemo() {
    println("Map Demo -- start")
    var map: Map<String, Int> = mapOf<String, Int>("key1" to 1, "key2" to 2, "key3" to 3)
    println("All Keys : ${map.keys}")
    println("All values: ${map.values}")
    if("key" in map) {
        println("The value of \"key\" is ${map["key2"]}")
    }

    if(1 in map.values) {
        println("The value 1 is in the map")
    }



    println("Map demo -- end")
}

fun setDemo() {
    println("Set demo -- start")
    var numSet: Set<Int> = setOf<Int>(2,4,6,8)

    println("Numbers into the set")
    println(numSet)

    if(numSet.contains(1)) {
        println("1 is present in the set")
    } else {
        println("1 is not present in the set")
    }

    var mNumSet: MutableSet<Int> = mutableSetOf<Int>(2,4,6,8)
    mNumSet.add(10)

    println("Numbers into the mutable set")
    println(mNumSet)

    var reverseNumSet: Set<Int> = setOf<Int>(8,6,4,2)

    println("Sets are equal: ${numSet == reverseNumSet}")

    println("Set demo -- end")
}

fun listDemo() {
    println("List Demo -- start")

    println("Mutable List")
    var list: List<Int> = listOf<Int>(1,4,7,10)

    println("Printing all the elements")
    for(i in list) {
        println(i)
    }

    println("Printing all the elements along with index")
    for((i, j) in list.withIndex()) {
        println("$i - $j")
    }

    println("Mutable List")
    var mList: MutableList<Int> = mutableListOf<Int>(1,4,7,10)
    mList[2] = 20

    println("Printing all the elements of mutable list")

    for(i in mList) {
        println(i)
    }

    mList.shuffle()

    println(mList)

    println("List Demo -- end")
}