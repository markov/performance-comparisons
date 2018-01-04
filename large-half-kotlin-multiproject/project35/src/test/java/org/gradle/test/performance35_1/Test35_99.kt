package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_99 {
    private val production = Production35_99("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}