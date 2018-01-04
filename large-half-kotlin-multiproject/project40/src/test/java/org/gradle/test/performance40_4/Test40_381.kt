package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_381 {
    private val production = Production40_381("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}