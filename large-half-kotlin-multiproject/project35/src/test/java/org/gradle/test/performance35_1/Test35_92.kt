package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_92 {
    private val production = Production35_92("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}