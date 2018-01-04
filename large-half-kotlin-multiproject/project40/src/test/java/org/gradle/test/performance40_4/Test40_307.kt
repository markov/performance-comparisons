package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_307 {
    private val production = Production40_307("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}