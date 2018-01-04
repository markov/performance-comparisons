package org.gradle.test.performance31_3

import org.junit.Assert.*

class Test31_280 {
    private val production = Production31_280("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}