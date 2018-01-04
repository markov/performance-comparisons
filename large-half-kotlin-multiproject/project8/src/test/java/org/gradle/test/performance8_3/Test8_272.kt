package org.gradle.test.performance8_3

import org.junit.Assert.*

class Test8_272 {
    private val production = Production8_272("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}