package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_278 {
    private val production = Production47_278("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
