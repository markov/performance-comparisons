package org.gradle.test.performance37_3

import org.junit.Assert.*

class Test37_223 {
    private val production = Production37_223("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}