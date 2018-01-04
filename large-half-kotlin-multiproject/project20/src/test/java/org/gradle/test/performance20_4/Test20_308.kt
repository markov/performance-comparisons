package org.gradle.test.performance20_4

import org.junit.Assert.*

class Test20_308 {
    private val production = Production20_308("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}