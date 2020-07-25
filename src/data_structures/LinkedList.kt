package data_structures

import data_structures.exceptions.LinkedListEmptyException

class LinkedList {

    private var head: Node? = null

    private var size = 0


    fun getSize() = size
    class Node {
        var value: Int = 0
        var next: Node? = null
    }




    fun empty() = size == 0

    fun valueAt(index: Int): Node? {
        var start = 0
        var currantNode = head
        if (size == 0) {
            throw LinkedListEmptyException()
        }
        if (index >= size || index < 0) {
            throw IndexOutOfBoundsException()
        }

        while (start < index) {
            start++
            currantNode = currantNode?.next
        }
        return currantNode
    }

    fun pushFront(value: Int) {
        val node = Node()
        node.value = value
        node.next = head
        head=node
        size++
    }

    override fun toString(): String {
        var toString=""
        var currantNode=head
        while (currantNode!=null){
           toString= toString.plus(" ${currantNode.value}")
            currantNode=currantNode.next
        }
        return "$toString size= $size"
    }
}