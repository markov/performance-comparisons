package org.gradle.test.performance5_3

import org.junit.Assert.*

class Test5_231 {
    private val production = Production5_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}