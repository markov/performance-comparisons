package org.gradle.test.performance31_3

import org.junit.Assert.*

class Test31_250 {
    private val production = Production31_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}