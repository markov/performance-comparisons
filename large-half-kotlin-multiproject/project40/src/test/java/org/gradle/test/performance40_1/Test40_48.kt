package org.gradle.test.performance40_1

import org.junit.Assert.*

class Test40_48 {
    private val production = Production40_48("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}