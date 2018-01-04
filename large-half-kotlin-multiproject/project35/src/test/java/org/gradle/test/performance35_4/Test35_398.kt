package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_398 {
    private val production = Production35_398("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}