package org.gradle.test.performance35_5

import org.junit.Assert.*

class Test35_491 {
    private val production = Production35_491("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}