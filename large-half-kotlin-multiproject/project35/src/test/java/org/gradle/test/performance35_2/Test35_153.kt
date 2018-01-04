package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_153 {
    private val production = Production35_153("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}