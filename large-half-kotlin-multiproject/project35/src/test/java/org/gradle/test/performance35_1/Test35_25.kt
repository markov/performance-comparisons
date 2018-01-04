package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_25 {
    private val production = Production35_25("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}