package org.gradle.test.performance20_2

import org.junit.Assert.*

class Test20_143 {
    private val production = Production20_143("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}