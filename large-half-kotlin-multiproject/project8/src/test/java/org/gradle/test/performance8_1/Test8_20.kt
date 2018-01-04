package org.gradle.test.performance8_1

import org.junit.Assert.*

class Test8_20 {
    private val production = Production8_20("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}