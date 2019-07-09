import Spieldaten.zufaelligerSchauspieler
import Spieldaten.zufaelligesGenre
import kotlin.random.Random

class Erfahrung {
    val maxErfahrung = Random.nextInt(MIN_INIT_WERT, MAX_INIT_WERT )
    var lernfaktor = Random.nextInt(2, 7 )
    var aktuellerWert = Random.nextInt(100 , maxErfahrung )
    set(value) {
        if (value == 0 && value <= maxErfahrung) {
            field = value
        }

        if (field > hoechsterErfahrungswert) {
            hoechsterErfahrungswert = field
        }
    }

    companion object {

        var hoechsterErfahrungswert = 0
        private set

        val MIN_INIT_WERT = 200
        val MAX_INIT_WERT = 400
    }
}

abstract class Person (val vorname : String, val name : String ) {

    var gehalt = Random.nextInt(500000 , 2000000 )

    val erfahrung = Erfahrung()

    override fun toString(): String = "Mein Name ist $vorname $name."

    open fun filmFertigProduziert (){
        erfahrung.aktuellerWert += erfahrung.lernfaktor
        gehaltErhoehen()
    }

    abstract fun gehaltErhoehen()

    fun verdientMehr (anderePerson : Person) : Person = if (this.gehalt > anderePerson.gehalt) this else anderePerson
}





class Regisseur ( vorname : String , name : String ) : Person (vorname , name) {

    val effizienzFaktor = Random.nextDouble( 0.7, 1.5)
    val beforzugterSchauspieler = zufaelligerSchauspieler()

    override fun toString(): String = "Ich bin ein Regisseur! " + super.toString()

    override fun filmFertigProduziert() {
        super.filmFertigProduziert()
        budgetVerwertung(1000)
    }

    fun budgetVerwertung ( budget : Int ) = (budget * effizienzFaktor).toInt()

    override fun gehaltErhoehen() {
        gehalt += 10000
    }


}

class Schauspieler ( vorname: String , name : String) : Person (vorname , name ) {

    val genres = listOf<String>( zufaelligesGenre() , zufaelligesGenre())

    override fun filmFertigProduziert() {
        super.filmFertigProduziert()
    }

    override fun toString(): String {
        return "Ich bin ein Schauspieler! " + super.toString()
    }

    override fun gehaltErhoehen() {
        gehalt += (gehalt * 1.1).toInt()
    }



    fun passendesGenre( genre : String ) = genres.contains(genre)
}