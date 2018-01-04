package org.gradle.test.performance35_3

import org.junit.Assert.*

class Test35_259 {
    private val production = Production35_259("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}