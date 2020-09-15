package data_structures
//
//import data_structures.exceptions.LinkedListEmptyException
//import java.lang.Exception
//
//class LinkedList : ILinkedList {
//    private var head: Node? = null
//    private var size = 0
//    override fun getSize() = size
//    class Node {
//        var value: Int = 0
//        var next: Node? = null
//    }
//
//    override fun empty() = size == 0
//    override fun valueAt(index: Int): Int? {
//        var start = 0
//        var currantNode = head
//        if (size == 0) {
//            throw LinkedListEmptyException()
//        }
//        if (index >= size || index < 0) {
//            throw IndexOutOfBoundsException()
//        }
//        while (start < index) {
//            start++
//            currantNode = currantNode?.next
//        }
//        return currantNode?.value
//    }
//
//    override fun pushFront(value: Int) {
//        val node = Node()
//        node.value = value
//        node.next = head
//        head = node
//        size++
//    }
//
//    override fun popFront(): Int {
//        val localCopy = head
//        if (localCopy != null) {
//            val nextTOHead = localCopy.next
//            val headValue = localCopy.value
//            head = nextTOHead
//            return headValue
//        } else {
//            throw LinkedListEmptyException()
//        }
//    }
//
//    override fun pushBack(value: Int) {
//        val localCopy = head
//        val node = Node()
//        node.next = null
//        node.value = value
//        if (localCopy == null) {
//            head = node
//        } else {
//            var tail = localCopy
//            while (tail?.next != null) {
//                tail = tail.next
//            }
//            tail?.next = node
//
//        }
//        size++
//
//    }
//
//    override fun popBack(): Int {
//        val localHead = head
//        if (localHead == null) {
//            throw  LinkedListEmptyException()
//        } else {
//            if (localHead.next == null) {
//                head = null
//                size--
//                return localHead.value
//            } else {
//                var beforeTail = localHead
//                var tail = localHead.next
//                while (tail?.next != null) {
//                    beforeTail = tail
//                    tail = tail.next
//                }
//                beforeTail?.next = null
//                if (tail != null) {
//                    size--
//                    return tail.value
//                }
//            }
//
//        }
//        throw Exception()
//    }
//
//
//    override fun front(): Int {
//        return head?.value ?: throw LinkedListEmptyException()
//    }
//
//    override fun back(): Int {
//        val tail = valueAt(size - 1)
//        return tail ?: throw LinkedListEmptyException()
//    }
//
//    override fun insertAt(index: Int, value: Int) {
//        if (index == 0) {
//            pushFront(value)
//            return
//        }
//        if (index == size) {
//            pushBack(value)
//            return
//        }
//
//        val valueAt = valueAt(index - 1) ?: throw java.lang.IndexOutOfBoundsException()
//        val nextToValueAt = valueAt.next
//        val newNode = Node()
//        newNode.value = value
//        newNode.next = nextToValueAt
//        valueAt.next = newNode
//    }
//
//
//    override fun toString(): String {
//        var toString = ""
//        var currantNode = head
//        while (currantNode != null) {
//            toString = toString.plus(" ${currantNode.value}")
//            currantNode = currantNode.next
//        }
//        return "$toString size= $size"
//    }
//
//    override fun erase(index: Int) {
//        if (size == 0) {
//            throw   LinkedListEmptyException()
//        }
//        if (index == 0) {
//            head = head?.next
//            size--
//            return
//        }
//        val beforeIndex = valueAt(index - 1)
//        val valueAtIndex = valueAt(index)
//        beforeIndex?.next = valueAtIndex?.next
//        size--
//
//
//    }
//
//    override fun value_n_from_end(index: Int): Int {
//        return valueAt((size - 1) - index)?.value?:throw IndexOutOfBoundsException()
//    }
//
//    override fun remove(value: Int) {
//        var currantNode = head
//        var index = 0;
//        while (currantNode != null) {
//            if (currantNode.value == value) {
//                erase(index)
//                return
//            }
//            currantNode = currantNode.next
//            index++
//
//        }
//    }
//
//    override fun reverse() {
//        val newLinkedList = LinkedList()
//        for (index in 0 until size) {
//            newLinkedList.pushBack(popBack())
//        }
//        this.size = newLinkedList.size
//        this.head = newLinkedList.head
//    }
//
//}