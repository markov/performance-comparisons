package org.gradle.test.performance40_1

import org.junit.Assert.*

class Test40_35 {
    private val production = Production40_35("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}