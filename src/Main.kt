import data_structures.ResizableArray

public fun main(args: Array<String>) {
    val arrayList = ResizableArray()
    println(arrayList.isEmpty())
    repeat(16) {
        arrayList.push(it)
        println(arrayList.toString())
    }
    println(arrayList.isEmpty())

    arrayList.insert(5,66666)
    arrayList.insert(2,77777)

    arrayList.insert(3,88888)

    arrayList.insert(7,10101010)

    println(arrayList.toString())
    arrayList.prepend(12121212)
    println(arrayList.toString())

    arrayList.pop()
    arrayList.pop()

    println(arrayList.toString())

    arrayList.delete(5)
    println(arrayList.toString())






}