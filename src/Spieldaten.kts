import kotlin.random.Random

object Spieldaten {

    var kontostand = 1000000

    private val schauspieler = mutableListOf<Schauspieler>()

    private val regisseur = mutableListOf<Regisseur>()

    val genres = listOf<String>("Action", "Drama", "Doku", "Comedy", "Fantasy", "Romanze")

    init {

        schauspieler.add( Schauspieler( "Emma", "Thompson"))
        schauspieler.add( Schauspieler( "John", "Goodman"))
        schauspieler.add( Schauspieler("Susi", "Sonnenschein"))
        schauspieler.add( Schauspieler("Fridolin", "Fröhlich"))

        regisseur.add( Regisseur( "Steven", "Spielberg"))
        regisseur.add( Regisseur( "Roland", "Emmerich"))
    }

    fun zufaelligerSchauspieler () = schauspieler [ Random.nextInt(0, schauspieler.size)]

    fun zufaelligerRegisseur () = regisseur [ Random.nextInt(0, regisseur.size)]

    fun zufaelligesGenre () = genres [ Random.nextInt(0, genres.size)]
}