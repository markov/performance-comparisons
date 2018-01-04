package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_431 {
    private val production = Production5_431("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}