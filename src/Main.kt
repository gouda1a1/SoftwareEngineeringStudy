import data_structures.ResizableArray

public fun main(args: Array<String>) {
    val arrayList = ResizableArray()

  repeat(100){
      arrayList.add(it)
      println(arrayList.getSize())

  }


}