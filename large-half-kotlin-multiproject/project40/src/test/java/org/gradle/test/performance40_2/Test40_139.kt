package org.gradle.test.performance40_2

import org.junit.Assert.*

class Test40_139 {
    private val production = Production40_139("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}