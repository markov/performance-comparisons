package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_321 {
    private val production = Production35_321("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}