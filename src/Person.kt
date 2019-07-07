import kotlin.random.Random

open class Person (val vorname : String, val name : String ) {

    var gehalt = Random.nextInt(500000 , 2000000 )
    var erfahrung = Random.nextInt(100 , 200 )

    override open fun toString(): String = "Mein Name ist $vorname $name"

    open fun filmFertigProduziert () : Unit {
        erfahrung += Random.nextInt( 10, 20 )
    }
}

class Regisseur ( vorname : String , name : String ) : Person (vorname , name) {

    val effizienzFaktor = Random.nextDouble( 0.7, 1.5)
    val beforzugterSchauspieler = Schauspieler ( "" , "" )
   
    override fun toString(): String = "Ich bin ein Regisseur " + super.toString()

    fun budgetVerwertung ( budget : Int ) = (budget * effizienzFaktor).toInt()
}

class Schauspieler ( vorname: String , name : String) {

    val genres = listOf<String> ( "Horror", "Comedy", "Action")

    override fun toString(): String {
        return "Ich bin ein Schauspieler! " + super.toString()
    }


    fun passendesGenre( genre : String ) = genres.contains(genre)
}