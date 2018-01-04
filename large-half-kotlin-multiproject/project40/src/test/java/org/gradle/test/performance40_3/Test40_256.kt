package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_256 {
    private val production = Production40_256("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}