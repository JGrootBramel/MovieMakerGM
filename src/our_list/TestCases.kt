package our_list

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class TestCases {


    @Test
    fun testBasic(){

        val list = SimpleLinkedList ()

        list.addLast(1)
        list.addLast(2)
        list.addLast(3)
        list.addLast(4)
        list.addLast(5)

        assertTrue { list.get(4) == 5 }
    }
    @Test
    fun testRemoveObject() {

        val list = SimpleLinkedList()

        list.addFirst(6)
        list.addFirst(5)
        list.addFirst(4)
        list.addFirst(3)
        list.addFirst(2)
        list.addFirst(1)

        list.removeObject(5)

        assertTrue { list.size() == 5}

        assertFalse { list.contains(5) }


        list.removeObject(1)
        list.removeObject(6)

        assertTrue { list.size() == 3 }
        assertEquals( list.get(0), 2)
        assertEquals( list.get(1), 3)
        assertEquals( list.get(2), 4)

    }
}


