package org.gradle.test.performance20_3

import org.junit.Assert.*

class Test20_261 {
    private val production = Production20_261("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}