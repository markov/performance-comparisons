package org.gradle.test.performance35_5

import org.junit.Assert.*

class Test35_465 {
    private val production = Production35_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}