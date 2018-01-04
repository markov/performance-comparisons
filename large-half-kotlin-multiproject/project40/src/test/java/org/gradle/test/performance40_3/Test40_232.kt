package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_232 {
    private val production = Production40_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}