package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_264 {
    private val production = Production40_264("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}