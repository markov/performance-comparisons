package org.gradle.test.performance35_5

import org.junit.Assert.*

class Test35_483 {
    private val production = Production35_483("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}