import data_structures.LinkedList
import data_structures.ResizableArray

public fun main(args: Array<String>) {
val linkedList=LinkedList()

    linkedList.pushFront(5)
    linkedList.pushFront(4)
    linkedList.pushFront(3)
    linkedList.pushFront(2)
    linkedList.pushFront(1)

    println(linkedList.valueAt(0)?.value)
    //println(linkedList.valueAt(6))


    println(linkedList.toString())




}