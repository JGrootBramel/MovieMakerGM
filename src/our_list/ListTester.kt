package our_list

fun main () {

    val list : SimpleListForAnything = SimpleLinkedList()

    list.addFirst("a")
    list.addFirst("B")
    list.addFirst("A")
    ausgabe(list)
    list.addLast("X")
    list.addLast("Y")
    list.addLast("Z")

    println(list.size())

    ausgabe(list)

    println(list.contains("A"))
    println(list.contains("Z"))
    list.removeObject("A")
    list.removeObject("Z")
    println(list.contains("A"))
    println(list.contains("Z"))

    ausgabe(list)


}

fun ausgabe ( list : SimpleListForAnything ) {

    for ( x in 0 until list.size() ) {
        println(list.get(x))
    }
}