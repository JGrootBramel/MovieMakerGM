package our_list

fun main () {

    val list : SimpleListForAnything = SimpleArrayList()

    list.addFirst("A")
    list.addFirst("B")
    list.addFirst("C")
    list.addLast("X")
    list.addLast("Y")
    list.addLast("Z")

    println(list.size())

    ausgabe(list)

    println("A in List: ${list.contains("A")}")
    println("X in List ${list.contains("X")}")
    list.removeObject("X")
    println("X in List ${list.contains("X")}")

}

fun ausgabe ( list : SimpleListForAnything ) {

    for ( x in 0 until list.size() ) {
        println(list.get(x))
    }
}