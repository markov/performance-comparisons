package org.gradle.test.performance35_3

import org.junit.Assert.*

class Test35_210 {
    private val production = Production35_210("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}