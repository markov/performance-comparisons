package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_349 {
    private val production = Production8_349("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}