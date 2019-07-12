package our_list

class SimpleListByDelegation : SimpleListForAnything {

    private val data = mutableListOf<Any>()

    override fun addFirst(obj: Any) {
        data.add(0, obj)
    }

    override fun addLast(obj: Any) {
        data.add(obj)
    }

    override fun contains(obj: Any) = data.contains(obj)


    override fun size(): Int = data.size

    override fun getFirst(): Any = data[0]

    override fun get(n: Int): Any = data[n]

    override fun removeObject(obj: Any) {
        data.remove(obj)
    }

}