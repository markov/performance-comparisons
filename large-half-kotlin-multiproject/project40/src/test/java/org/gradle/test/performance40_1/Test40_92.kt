package org.gradle.test.performance40_1

import org.junit.Assert.*

class Test40_92 {
    private val production = Production40_92("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}