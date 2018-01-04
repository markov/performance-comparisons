package org.gradle.test.performance8_5

import org.junit.Assert.*

class Test8_490 {
    private val production = Production8_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}