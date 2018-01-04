package org.gradle.test.performance31_3

import org.junit.Assert.*

class Test31_223 {
    private val production = Production31_223("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}