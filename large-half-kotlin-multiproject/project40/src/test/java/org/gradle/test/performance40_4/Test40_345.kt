package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_345 {
    private val production = Production40_345("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}