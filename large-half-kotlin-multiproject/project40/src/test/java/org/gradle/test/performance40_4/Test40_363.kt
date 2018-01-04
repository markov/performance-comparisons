package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_363 {
    private val production = Production40_363("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}