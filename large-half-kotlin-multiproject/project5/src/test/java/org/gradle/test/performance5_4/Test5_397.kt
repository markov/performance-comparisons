package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_397 {
    private val production = Production5_397("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}