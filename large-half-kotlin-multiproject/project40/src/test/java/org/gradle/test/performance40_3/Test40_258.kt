package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_258 {
    private val production = Production40_258("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}