package org.gradle.test.performance8_2

import org.junit.Assert.*

class Test8_124 {
    private val production = Production8_124("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}