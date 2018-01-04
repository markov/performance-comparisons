package org.gradle.test.performance40_5

import org.junit.Assert.*

class Test40_422 {
    private val production = Production40_422("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}