package org.gradle.test.performance20_4

import org.junit.Assert.*

class Test20_317 {
    private val production = Production20_317("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}