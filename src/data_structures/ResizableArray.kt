package data_structures

import java.lang.IndexOutOfBoundsException

class ResizableArray {
    private var array = IntArray(16)
    private var capacity = 16
    private var size = 0
    fun add(input: Int) {
        if (size == capacity ) {
            capacity *= 2
            val newArray = IntArray(capacity)
            var index = 0
            array.iterator().forEach {
                newArray[index] = it
                index++
            }
            array = newArray
            newArray[size] = index

        } else {
            array[size] = input
        }
        size++


    }

    fun get(index: Int): Int {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException()
        } else {
            return array[index]
        }
    }

    fun getSize() = size
}