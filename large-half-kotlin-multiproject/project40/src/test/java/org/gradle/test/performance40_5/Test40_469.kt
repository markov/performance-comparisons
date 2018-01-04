package org.gradle.test.performance40_5

import org.junit.Assert.*

class Test40_469 {
    private val production = Production40_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}