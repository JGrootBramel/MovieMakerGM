

fun main () {

    println("MovieMakerGM startet")

    val steven = Regisseur ("Steven" , "Spielberg")
    val roland = Regisseur ("Roland" , "Emmerich")
    val emma = Schauspieler ("Emma" , "Thompson")
    val susi = Schauspieler ("Susi" , "Sonnenschein")

    val ersterFilm = Film (steven, emma, 100000, "Thriller", "Auf der Straße nach Gummersbach")
    val zweiterFilm = Film (steven, susi, 80000, "Horror", "Los nach Köln")


    ersterFilm.produzieren()
    zweiterFilm.produzieren()

    var irgendwer : Person = roland.verdientMehr(steven)

    println(irgendwer)

    if(irgendwer is Regisseur) {
        println("Ich bin so effizient: ${irgendwer.effizienzFaktor}")
    }
}
