package org.gradle.test.performance40_2

import org.junit.Assert.*

class Test40_162 {
    private val production = Production40_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}