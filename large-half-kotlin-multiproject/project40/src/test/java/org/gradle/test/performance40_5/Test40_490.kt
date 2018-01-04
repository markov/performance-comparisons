package org.gradle.test.performance40_5

import org.junit.Assert.*

class Test40_490 {
    private val production = Production40_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}