package org.gradle.test.performance40_5

import org.junit.Assert.*

class Test40_478 {
    private val production = Production40_478("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}