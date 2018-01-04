package org.gradle.test.performance40_5

import org.junit.Assert.*

class Test40_468 {
    private val production = Production40_468("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}