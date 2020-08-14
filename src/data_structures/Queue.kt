package data_structures

import data_structures.exceptions.IQueue

class Queue : IQueue {

    private val linkedList = LinkedList()

    override fun enqueue(value: Int) {
        linkedList.pushFront(value)
    }

    override fun dequeue(): Int {
        return linkedList.popBack()
    }


    fun empty() = linkedList.empty()

}

