package org.gradle.test.performance40_1

import org.junit.Assert.*

class Test40_65 {
    private val production = Production40_65("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}