package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_215 {
    private val production = Production47_215("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
