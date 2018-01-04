package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_438 {
    private val production = Production5_438("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}