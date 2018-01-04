package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_379 {
    private val production = Production40_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}