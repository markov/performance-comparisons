package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_373 {
    private val production = Production40_373("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}