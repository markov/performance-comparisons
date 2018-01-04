package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_293 {
    private val production = Production40_293("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}