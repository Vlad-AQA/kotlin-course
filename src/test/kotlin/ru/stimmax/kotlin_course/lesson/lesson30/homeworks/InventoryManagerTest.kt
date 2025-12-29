package ru.stimmax.kotlin_course.lesson.lesson30.homeworks

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ru.stimmax.ru.stimmax.kotlin_course.lesson.lesson30.homeworks.InventoryManager
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class InventoryManagerTest {

    private val inventoryManager = InventoryManager(10)

    @BeforeEach
    fun setup() {
        inventoryManager.addItem("chair", 4)
    }

    @Test
    fun `get item count test`() {
        assertEquals(0, inventoryManager.getItemCount("bull"))
    }

    @Test
    fun `item count not 0 test`() {
        assertEquals(4, inventoryManager.getItemCount("chair"))

    }

    //    @Ignore
    @Test
    fun `add item test`() {
        inventoryManager.addItem("chair", 4)
        assertEquals(8, inventoryManager.getItemCount("chair"))
    }

    @Test
    fun `add item throw test`() {
        assertThrows(IllegalStateException::class.java) { inventoryManager.addItem("chair", 7) }
    }

    @Test
    fun `remove item happy test`() {
        assertTrue { inventoryManager.removeItem("chair", 2) }
        assertEquals(2, inventoryManager.getItemCount("chair"))
    }

    @Test
    fun `remove zero item  test`() {
        assertTrue { inventoryManager.removeItem("chair", 0) }
        assertEquals(4, inventoryManager.getItemCount("chair"))
    }

    @Test
    fun `remove item not positively test`() {
        assertFalse { inventoryManager.removeItem("chair", -1) }
    }

    @Test
    fun `remove all item test`() {
        assertTrue { inventoryManager.removeItem("chair", 4) }
        assertEquals(0, inventoryManager.getItemCount("chair"))
    }

    @Test
    fun `remove item not capacity test`() {
        assertFalse { inventoryManager.removeItem("chair", 5) }
        assertEquals(4, inventoryManager.getItemCount("chair"))

    }
}
// метод приватный хз как тестить
//    @Test
//    fun `check capacity happy test`() {
//        assertTrue { inventoryManager.c}
//    }
//}

