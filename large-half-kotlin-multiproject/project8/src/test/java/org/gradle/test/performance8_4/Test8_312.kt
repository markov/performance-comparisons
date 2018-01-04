package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_312 {
    private val production = Production8_312("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}