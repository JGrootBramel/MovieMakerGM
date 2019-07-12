package our_list

class SimpleArrayList : SimpleListForAnything {

    private val BLOCK_SIZE = 8

    private var data = arrayOfNulls<Any>(BLOCK_SIZE)
    private var index = 0

    private fun checkArraySize () {
        if ( index >= data.size ) {
            val newArray = arrayOfNulls<Any>( data.size + BLOCK_SIZE )
            System.arraycopy( data, 0, newArray, 0, data.size )
            data = newArray
        }
    }

    override fun addFirst(obj : Any){
        System.arraycopy( data , 0, data, 1, index )
        data[0] = obj
        index++
        checkArraySize()

    }

    override fun addLast(obj: Any) {
        data[ index++ ] = obj
        checkArraySize()
    }

    override fun contains(obj: Any): Boolean {
        for (i in 0 until size()) {
            if (data[i] == obj) return true
        }

        return false
    }


    override fun get(n: Int): Any  = if (index > 0 && n < index) data[n] as Any else throw ArrayIndexOutOfBoundsException()

    override fun getFirst(): Any = if (index > 0) data[0] as Any else throw ArrayIndexOutOfBoundsException()

    override fun removeObject(obj: Any) {
        for (i in 0 until size()) {
            if (data[i] == obj ) {
                System.arraycopy(data, i + 1, data, i, index -2)
                println("Objekt removed")
                index--
            }

        }
    }

    override fun size(): Int = index

    override fun isEmpty() = index == 0


}