

class Kritiker (vorname : String, name : String) : Person (vorname , name), Bewertung {


    private val lieblingsSchauspieler = Spieldaten.zufaelligerSchauspieler()

    override fun gehaltErhoehen() {}

    override fun getPunkte(film: Film): Int = if (film.hauptdarsteller == lieblingsSchauspieler) 10 else 2

}
