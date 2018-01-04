package org.gradle.test.performance40_1

import org.junit.Assert.*

class Test40_46 {
    private val production = Production40_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}