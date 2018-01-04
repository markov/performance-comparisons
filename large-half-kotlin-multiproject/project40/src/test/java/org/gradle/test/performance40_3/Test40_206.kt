package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_206 {
    private val production = Production40_206("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}