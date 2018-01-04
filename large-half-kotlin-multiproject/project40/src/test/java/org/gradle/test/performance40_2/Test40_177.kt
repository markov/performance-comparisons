package org.gradle.test.performance40_2

import org.junit.Assert.*

class Test40_177 {
    private val production = Production40_177("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}