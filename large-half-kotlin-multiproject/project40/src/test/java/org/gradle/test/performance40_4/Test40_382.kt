package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_382 {
    private val production = Production40_382("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}