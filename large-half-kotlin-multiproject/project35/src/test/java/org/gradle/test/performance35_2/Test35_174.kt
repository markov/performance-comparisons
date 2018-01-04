package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_174 {
    private val production = Production35_174("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}