package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_350 {
    private val production = Production35_350("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}