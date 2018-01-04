package org.gradle.test.performance40_5

import org.junit.Assert.*

class Test40_480 {
    private val production = Production40_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}