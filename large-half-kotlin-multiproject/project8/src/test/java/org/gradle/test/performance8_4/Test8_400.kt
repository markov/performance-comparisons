package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_400 {
    private val production = Production8_400("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}