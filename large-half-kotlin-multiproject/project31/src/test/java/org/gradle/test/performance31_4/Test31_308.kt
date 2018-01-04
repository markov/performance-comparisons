package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_308 {
    private val production = Production31_308("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}