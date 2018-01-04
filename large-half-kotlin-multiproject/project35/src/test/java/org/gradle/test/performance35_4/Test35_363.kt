package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_363 {
    private val production = Production35_363("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}