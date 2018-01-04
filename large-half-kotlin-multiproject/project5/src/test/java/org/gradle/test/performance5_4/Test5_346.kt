package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_346 {
    private val production = Production5_346("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}