package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_319 {
    private val production = Production35_319("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}