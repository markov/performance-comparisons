package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_93 {
    private val production = Production35_93("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}