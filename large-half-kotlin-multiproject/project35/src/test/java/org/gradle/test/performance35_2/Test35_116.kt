package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_116 {
    private val production = Production35_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}