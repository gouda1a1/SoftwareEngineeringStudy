package data_structures

import java.util.*

class QueueBy2Stacks {
    private val ENQUEUE = 1
    private val DEQUEUE = 2
    private var peek=-1

    private val mainStack: Stack<Int> = Stack()
    private val bucketStack: Stack<Int> = Stack()

    var lastOperation = ENQUEUE

    fun enqueue(value: Int) {
        if(peek==-1){
            peek=value
        }
        mainStack.push(value)
        lastOperation = ENQUEUE
    }

    fun dequeue(): Int? {
        if(bucketStack.isEmpty()){
            for (index in 0 until mainStack.size) {
                bucketStack.push(mainStack.pop())
            }
        }
        lastOperation = DEQUEUE
       return bucketStack.pop()

    }

    fun printFront() {
        if(bucketStack.isNotEmpty()){
            println(bucketStack.peek())
        }else{
            bucketStack.push(dequeue())
        }

    }

}