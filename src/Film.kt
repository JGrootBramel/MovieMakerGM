class Film ( val regisseur : Regisseur , val hauptdarsteller : Schauspieler,
             val budget : Int , val genre : String , val titel : String){
    val ausgaben = regisseur.gehalt + hauptdarsteller.gehalt + budget

    var einnahmen = 0
    private set

    private val bewertungen = mutableListOf<Bewertung>()

    fun produzieren () {

        bewerten()
        hauptdarsteller.filmFertigProduziert()
        regisseur.filmFertigProduziert()
    }

    fun bewerten () {

        val b1 = BewertungNachPassenderBesetzung()
        val b2 = BewertungsPerZufall()

        bewertungen.add(b1)
        bewertungen.add(b2)
        bewertungen.add( Kritiker ("Horstsch", "Puschalke"))

        // Durchschnitliche Bewertung berechnen
        var gesamtPunkte = 0
        for ( b in bewertungen) {
            gesamtPunkte += b.getPunkte(this)
            b.getInfotext(this)
        }

        println("Die Bewertung von $titel ist $gesamtPunkte")
    }
}