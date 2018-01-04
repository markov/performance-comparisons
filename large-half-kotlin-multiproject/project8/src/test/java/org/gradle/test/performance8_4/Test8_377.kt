package org.gradle.test.performance8_4

import org.junit.Assert.*

class Test8_377 {
    private val production = Production8_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}