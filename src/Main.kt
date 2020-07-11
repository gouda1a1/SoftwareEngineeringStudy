import data_structures.ResizableArray

public fun main(args: Array<String>) {
    val arrayList = ResizableArray()
    println(arrayList.isEmpty())
    repeat(17) {
        arrayList.push(it)
        println(arrayList.at(it * 1))
    }
    println(arrayList.isEmpty())


}