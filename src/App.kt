

fun main () {

    println("MovieMakerGM startet")

    val steven = Regisseur ("Steven" , "Spielberg")
    val emma = Schauspieler ("Emma" , "Thompson")
    val susi = Person ("Susi" , "Sonnenschein")

    println("${steven.vorname} ${steven.name}")
}

fun verdientMehr (p1 : Person , p2 : Person) : Person = if ( p1.gehalt > p2.gehalt ) p1 else p2