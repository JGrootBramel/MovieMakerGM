import kotlin.random.Random

interface Bewertung{
    fun getPunkte ( film: Film ) : Int
    fun getInfotext (film: Film ) : String

}

class BewertungNachPassenderBesetzung : Bewertung {

    override fun getInfotext(film: Film): String = if (getPunkte(film) > 5) "Toller Film" else "Mieser Film"

    override fun getPunkte(film: Film): Int {

        var punkte = 0
        if (film.hauptdarsteller.passendesGenre(film.genre)) punkte += 5
        if (film.regisseur.beforzugterSchauspieler == film.hauptdarsteller) punkte += 5

        return punkte
    }
}



class BewertungsPerZufall : Bewertung {

    override fun getPunkte(film: Film): Int = Random.nextInt(1,10)

    override fun getInfotext(film: Film): String = if (getPunkte(film) > 5) "Toller Film" else "Mieser Film"

}