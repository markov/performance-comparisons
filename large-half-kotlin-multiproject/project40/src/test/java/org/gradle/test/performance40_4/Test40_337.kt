package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_337 {
    private val production = Production40_337("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}