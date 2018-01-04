package org.gradle.test.performance5_3

import org.junit.Assert.*

class Test5_262 {
    private val production = Production5_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}