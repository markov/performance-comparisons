package org.gradle.test.performance40_2

import org.junit.Assert.*

class Test40_185 {
    private val production = Production40_185("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}