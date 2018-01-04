package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_103 {
    private val production = Production47_103("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
