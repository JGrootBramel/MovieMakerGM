package our_list

interface SimpleListForAnything {

    fun addFirst ( obj : Any )
    fun addLast ( obj : Any )
    fun contains ( obj : Any ) : Boolean
    fun size () : Int
    fun getFirst () : Any
    fun get ( n : Int ) : Any
    fun removeObject ( obj : Any)
    fun isEmpty () : Boolean
}