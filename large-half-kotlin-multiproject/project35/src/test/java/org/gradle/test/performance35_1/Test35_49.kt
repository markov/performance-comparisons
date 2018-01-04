package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_49 {
    private val production = Production35_49("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}