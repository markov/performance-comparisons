package org.gradle.test.performance5_2

import org.junit.Assert.*

class Test5_121 {
    private val production = Production5_121("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}