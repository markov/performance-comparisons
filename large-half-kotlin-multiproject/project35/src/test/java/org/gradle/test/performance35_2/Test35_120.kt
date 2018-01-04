package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_120 {
    private val production = Production35_120("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}