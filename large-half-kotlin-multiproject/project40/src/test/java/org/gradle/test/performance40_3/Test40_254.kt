package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_254 {
    private val production = Production40_254("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}