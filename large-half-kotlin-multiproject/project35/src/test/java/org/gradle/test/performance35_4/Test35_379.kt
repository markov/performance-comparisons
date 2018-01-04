package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_379 {
    private val production = Production35_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}