package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_310 {
    private val production = Production40_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}