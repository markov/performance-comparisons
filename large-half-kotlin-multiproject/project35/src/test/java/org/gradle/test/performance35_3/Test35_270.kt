package org.gradle.test.performance35_3

import org.junit.Assert.*

class Test35_270 {
    private val production = Production35_270("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}