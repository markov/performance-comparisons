package org.gradle.test.performance20_3

import org.junit.Assert.*

class Test20_298 {
    private val production = Production20_298("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}