package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_329 {
    private val production = Production35_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}