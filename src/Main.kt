import data_structures.ResizableArray

public fun main(args: Array<String>) {
    val arrayList = ResizableArray()
    println(arrayList.isEmpty())
    repeat(16) {
        arrayList.push(it)
        println(arrayList.toString())
    }
    println(arrayList.isEmpty())

    arrayList.insert(0,66666)
    arrayList.insert(0,77777)

    arrayList.insert(0,88888)

    arrayList.insert(0,10101010)

    println(arrayList.toString())



}