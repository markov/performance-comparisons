package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_37 {
    private val production = Production35_37("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}