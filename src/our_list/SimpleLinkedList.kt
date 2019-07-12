package our_list

class SimpleLinkedList : SimpleListForAnything {


    class Node ( val data : Any , var next : Node? )

    private var first : Node? = null

    override fun addFirst(obj: Any) {
        first = Node(obj, first)
    }

    override fun addLast(obj: Any) {

        if ( first == null ) addFirst(obj)

        var runPointer = first

        while (runPointer?.next != null ) {
            runPointer = runPointer.next
        }

        runPointer?.next = Node (obj , null)


    }

    override fun contains(obj: Any): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun size(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFirst(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(n: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeObject(obj: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty() = first == null

}