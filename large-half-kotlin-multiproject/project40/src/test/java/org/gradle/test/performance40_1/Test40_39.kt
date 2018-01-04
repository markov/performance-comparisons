package org.gradle.test.performance40_1

import org.junit.Assert.*

class Test40_39 {
    private val production = Production40_39("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}