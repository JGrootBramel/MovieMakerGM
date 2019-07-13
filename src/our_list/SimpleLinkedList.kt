package our_list

import java.lang.IndexOutOfBoundsException

class SimpleLinkedList : SimpleListForAnything {


    class Node ( val data : Any , var next : Node? )

    private var first : Node? = null

    override fun addFirst(obj: Any) {
        first = Node(obj, first)
    }

    override fun addLast(obj: Any) {

        if ( first == null ) {
            addFirst(obj)
        } else {
            var runPointer = first
            while (runPointer?.next != null) {
                runPointer = runPointer.next
            }

            runPointer?.next = Node(obj, null)
        }

    }

    override fun contains(obj: Any): Boolean {
        var run = first
        while (run != null ) {
            if (run.data == obj) return true
            run = run.next
        }
        return false
    }

    override fun size(): Int {

        var run = first
        var count = 0
        while ( run != null ) {
            count++
            run = run.next
        }
        return count
    }

    override fun getFirst() : Any = get(0)

    override fun get(n: Int): Any {
        if ( n < 0 ) throw IndexOutOfBoundsException()
        var run = first
        var count = 0
        while ( count < n && run != null) {
            run = run.next
            count++
        }
        return run?.data ?: throw IndexOutOfBoundsException()
    }


    override fun removeObject(obj: Any) {

        var run = first

        if (run?.data == obj) {
            first = first?.next
        } else {

            while (run?.next?.data != obj) {
                run = run?.next
            }

            run.next = run.next?.next

        }
    }

    override fun isEmpty() = first == null

}