package org.gradle.test.performance8_5

import org.junit.Assert.*

class Test8_463 {
    private val production = Production8_463("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}