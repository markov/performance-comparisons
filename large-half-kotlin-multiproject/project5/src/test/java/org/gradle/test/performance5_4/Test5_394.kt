package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_394 {
    private val production = Production5_394("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}