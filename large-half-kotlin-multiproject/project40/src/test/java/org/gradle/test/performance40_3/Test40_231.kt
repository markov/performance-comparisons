package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_231 {
    private val production = Production40_231("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}