package org.gradle.test.performance40_3

import org.junit.Assert.*

class Test40_238 {
    private val production = Production40_238("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}