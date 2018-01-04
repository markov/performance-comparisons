package org.gradle.test.performance35_3

import org.junit.Assert.*

class Test35_286 {
    private val production = Production35_286("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}