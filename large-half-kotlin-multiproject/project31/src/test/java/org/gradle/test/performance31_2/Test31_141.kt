package org.gradle.test.performance31_2

import org.junit.Assert.*

class Test31_141 {
    private val production = Production31_141("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}