package fundamentos


fun main(){
    var list = mutableListOf(1, 2, 3, 4 , 5 , 6)

    println(list)

    list.add(12)
    list.removeAt(1)
    list.remove(3)

    println(list)

}



